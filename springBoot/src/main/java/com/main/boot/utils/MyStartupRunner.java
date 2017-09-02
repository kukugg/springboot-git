package com.main.boot.utils;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * <p>Description:服务启动执行</p> 
 * @author hjp  
 * @date 2017-9-1 上午11:21:21
 */
@Component
public class MyStartupRunner implements CommandLineRunner {

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作<<<<<<<<<<<<<");
	}

}
