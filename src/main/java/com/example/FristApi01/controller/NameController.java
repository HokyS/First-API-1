package com.example.FristApi01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping(value = "")
    public String getName(){
        return "Mario";
    }
    @PostMapping(value = "")
    public String postName(){
        return "oiraM";
    }
}
