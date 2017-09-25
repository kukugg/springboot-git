package com.main.boot;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.context.embedded.MultipartConfigFactory;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;


@SpringBootApplication
@ServletComponentScan
public class StartApp {

	
	//注入bean 使用fastjon 解析json
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		fastConverter.setFastJsonConfig(fastJsonConfig);
		HttpMessageConverter<?> converter = fastConverter;
		return new HttpMessageConverters(converter);
		
	}
	
	//注入bean 对文件上传的限制
	public MultipartConfigElement multipartConfigElement() {
		
		MultipartConfigFactory factory = new MultipartConfigFactory();
		// 设置文件大小限制 ,超了，页面会抛出异常信息，这时候就需要进行异常信息的处理了;
		factory.setMaxRequestSize("128KB");
		/// 设置总上传数据总大小
        factory.setMaxRequestSize("256KB"); 
        //factory.setLocation("路径地址");
        return factory.createMultipartConfig(); 
	}
	
	
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(StartApp.class, args);
	}
	
}
