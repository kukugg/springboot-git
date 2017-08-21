package com.main.boot.utils;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/*
 * 全局异常捕捉
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	
	Logger logger = Logger.getLogger(GlobalDefaultExceptionHandler.class);
	
	@ExceptionHandler(value = Exception.class)
	public void defaultErrorHandler(HttpServletRequest req, Exception e) {
		e.printStackTrace();
		logger.error(e.getMessage());
	}

}
