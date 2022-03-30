package com.cn.service;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 自定义监听
 */
@Component
public class MyListener implements ApplicationListener<ApplicationEvent> {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof MyEvent){
			((MyEvent) event).event();
		}
	}
}
