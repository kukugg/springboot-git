package com.main.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.main.boot.bean.Demo;

@RestController
@RequestMapping("/demo")
public class demoController {
	
	@RequestMapping("/getDemo")
    public Demo getDemo(){

       Demo demo = new Demo();
       demo.setId(1);
       demo.setName("Angel");
       return demo;

    }

}
