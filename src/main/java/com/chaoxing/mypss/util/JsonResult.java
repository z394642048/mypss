package com.chaoxing.mypss.util;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.HashMap;
import java.util.Map;

public final class JsonResult {

    private Integer code;
    private String message;
    private String description;
    private Map<String, Object> data = new HashMap<String, Object>();
    public static final Integer CODE_FAILURE = 0;
    public static final Integer CODE_SUCCESS = 1;
    private static final Map<Integer, String> messageMap = new HashMap<Integer, String>() {
        private static final long serialVersionUID = -7326308791851018461L;

        {
            put(0, "请求错误");
            put(1, "请求正确响应");
        }
    };

    public JsonResult() {
    }

    public JsonResult(Integer code) {
        this.code = code;
        this.message = messageMap.get(code);
    }

    public JsonResult(Integer code, String message) {
        this(code);
        this.message = message;
    }

    public JsonResult(Integer code, String message, String description) {
        this(code, message);
        this.description = description;
    }

    public static final JsonResult success() {
        JsonResult jsonResult = new JsonResult(CODE_SUCCESS);
        return jsonResult;
    }

    public static final JsonResult failure() {
        JsonResult jsonResult = new JsonResult(CODE_FAILURE);
        return jsonResult;
    }

    public JsonResult put(String name, Object data) {
        this.data.put(name, data);
        return this;
    }

    public String toJsonString() {
        return JSON.toJSONString(this);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
        this.message = messageMap.get(code);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public static Map<Integer, String> getMessagemap() {
        return messageMap;
    }
}
