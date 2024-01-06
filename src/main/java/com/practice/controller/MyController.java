package com.practice.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class MyController {

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Model model){
        //putting variable in model
        model.addAttribute("name","shrey");

        return "about";
        //ye about.html khol dega and uska path apan ko application.properties file mai viewresolver mai bhi nhi dena
        //bas resources/templates folder mai daaldo apne khul jaaega.
    }

    @GetMapping("/iterate")
    public String iterateHandler(Model model){
        ArrayList arrayList=new ArrayList<>();
        arrayList.add("helo");
        arrayList.add("shrey");
        arrayList.add("how");
        arrayList.add("are you?");

        model.addAttribute("list",arrayList);

        return "iterate";
    }

    @GetMapping("/condition")
    public String conditionHandler(Model model){
           model.addAttribute("active",true);
           model.addAttribute("gender","M");

        ArrayList arrayList=new ArrayList<>();
        arrayList.add("helo");
        arrayList.add("shrey");
        arrayList.add("how");
        arrayList.add("are you?");
        model.addAttribute("mylist",arrayList);

           return "condition";
    }

    @GetMapping("/fragment")
    public String fragment(Model model){

        return "fragment";
    }

    @GetMapping("/fragment2")
    public String fragment2(Model model){
        model.addAttribute("title","CatFragments");
        return "fragment2";
    }


}
