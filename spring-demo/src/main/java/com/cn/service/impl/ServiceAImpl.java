package com.cn.service.impl;

import com.cn.service.ServiceA;
import com.cn.service.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceAImpl implements ServiceA {

	@Autowired
	private ServiceB serviceB;

	@Override
	public void testA() {
		System.out.println("这是testA");
		serviceB.testB();
		System.out.println("====================A");
	}
}
