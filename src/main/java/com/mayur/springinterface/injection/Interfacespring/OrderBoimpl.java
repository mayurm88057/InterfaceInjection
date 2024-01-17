package com.mayur.springinterface.injection.Interfacespring;

import org.springframework.stereotype.Component;


public class OrderBoimpl implements OrderBo {

	private OrderDao dao;

	@Override
	public void placeOrder() {
		System.out.println("inside the order bo");
		dao.createOrder();

	}

	public OrderDao getDao() {
		return dao;
	}

	public void setDao(OrderDao dao) {
		this.dao = dao;
	}

}
