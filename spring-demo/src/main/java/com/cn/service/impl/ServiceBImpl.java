package com.cn.service.impl;

import com.cn.service.ServiceA;
import com.cn.service.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceBImpl implements ServiceB {

	@Autowired
	private ServiceA serviceA;

	@Override
	public void testB() {
		System.out.println("这是testB");
		serviceA.testA();
		System.out.println("====================B");
	}
}
