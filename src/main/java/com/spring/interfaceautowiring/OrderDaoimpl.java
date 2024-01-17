package com.spring.interfaceautowiring;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDaoimpl implements OrderDao {

	@Override
	public void createorder() {
		System.out.println("inside the dao");

	}

}
