package com.main.boot.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 模版测试
 * @author Administrator
 *
 */
@Controller
public class TemplateController {
	
	 @RequestMapping("/helloHtml")
	 public String helloHtml(Map<String,Object> map){
         map.put("hello","fromTemplateController.helloHtml");
         return "/MyHtml";
	 }
}
