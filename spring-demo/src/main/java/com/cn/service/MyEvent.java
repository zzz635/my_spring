package com.cn.service;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {
	private static final long serialVersionUID = 7099057708183575637L;

	public MyEvent(Object source) {
		super(source);
	}
	public void event(){
		System.out.println("自定义事件逻辑");
	}
}
