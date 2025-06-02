package com.visualvibes.algovis.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestApi {
    @GetMapping("/")
    public String testMyApp(){
        return "Working Just Fine !!!";
    }

}
