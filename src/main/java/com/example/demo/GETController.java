package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GETController {
    @RequestMapping("/")
    @ResponseBody
    public String helloHandler () {
        return "<h1>Hello World to stego proj!</h1>";
    }
}