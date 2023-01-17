package com.app.springsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() { return "/index"; }

    @RequestMapping("/join")
    public String join() {
        return "/join";
    }

    @RequestMapping("/login")
    public String login() {
        return "/login";
    }


}
