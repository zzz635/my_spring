package com.cn;

import com.cn.config.ZConfig;
import com.cn.service.MyEvent;
import com.cn.service.ServiceA;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-demo.xml");
		applicationContext.publishEvent(new MyEvent("123"));
		applicationContext.getBean("serviceAImpl");
		ConfigurableListableBeanFactory beanFactory = applicationContext.getBeanFactory();
		System.out.println(beanFactory.getBean("serviceAImpl"));
//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ZConfig.class);
//		ConfigurableListableBeanFactory beanFactory = applicationContext.getBeanFactory();
//		System.out.println(beanFactory.getBean("serviceAImpl"));
	}
}
