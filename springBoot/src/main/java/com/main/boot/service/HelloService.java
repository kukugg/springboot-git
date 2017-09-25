package com.main.boot.service;

import org.springframework.stereotype.Service;


@Service
public class HelloService {
	
	public String name() {
		return "hello";
	}

}
