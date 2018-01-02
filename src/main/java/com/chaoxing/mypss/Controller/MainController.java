package com.chaoxing.mypss.Controller;

import com.chaoxing.mypss.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MainController {


    public String index(@ModelAttribute Employee employee) {
        System.out.println(employee);

        return "";
    }
}
