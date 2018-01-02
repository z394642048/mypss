package com.chaoxing.mypss.Controller;

import com.chaoxing.mypss.model.Employee;
import com.chaoxing.mypss.service.IEmployeeService;
import com.chaoxing.mypss.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("login")
@SessionAttributes("loginUser")
public class LoginController {

    @Autowired
    IEmployeeService employeeService;

    @Autowired
    private RedisService redisService;

    @RequestMapping({"index", "", "/"})
    public String login(Employee employee, ModelMap modelMap) {
        Employee loginUser = employeeService.getOneByLoginUser(employee);
        if (loginUser == null) {
            return "login";
        } else {
            modelMap.addAttribute("loginUser",loginUser);
            redisService.set("loginUser",loginUser);
            return "main";
        }
    }
}
