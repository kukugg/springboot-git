package com.main.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {
	
	@RequestMapping("/hello")
    public int hello(){

       return 100/0;

    }
	

}
