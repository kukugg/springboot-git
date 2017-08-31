package com.main.boot.utils;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 
 * <p>Description:监听Session的创建与销毁</p> 
 * @author hjp  
 * @date 2017-8-30 下午3:17:45
 */
@WebListener
public class MyHttpSessionListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("Session 被创建");
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("ServletContex初始化");
		
	}

	
	
}
