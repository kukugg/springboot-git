package com.main.boot.job;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/*
 * 定时任务测试
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {
	
	@Scheduled(cron = "0/10 * * * * ?") // 每20秒执行一次
	public void scheduler() {
		//System.out.println("test schedule");
	}

}
