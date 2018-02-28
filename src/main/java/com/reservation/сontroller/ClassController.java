package com.reservation.сontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClassController {
    @RequestMapping(value = "/")
    public String home(){
        return "test";
    }
}
