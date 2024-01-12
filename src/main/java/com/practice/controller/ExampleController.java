package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//controller to show how to add images,js,css files in spring boot application
@Controller
public class ExampleController {
    @RequestMapping("/example")
    public String example(){
        return "example";
    }


}
