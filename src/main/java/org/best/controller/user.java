package org.best.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class user {
    @RequestMapping(value = "/go")
    public String go() {
        System.out.println("收到请求了");
        return "success";
    }
}
