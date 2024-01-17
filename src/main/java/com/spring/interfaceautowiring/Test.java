package com.spring.interfaceautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext(
				"com/spring/interfaceautowiring/Config.xml");
		OrderBo bo = (OrderBo) context.getBean("bo");
		bo.placeorder();
		
		
	}
}
