package com.spring.interfaceautowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBoimpl implements OrderBo {
 
	@Autowired
	@Qualifier("dao")
	private OrderDao dao; 
	
	@Override
	public void placeorder() {
		System.out.println("inside the bo");
		dao.createorder();
	}

	public OrderDao getDao() {
		return dao;
	}

	public void setDao(OrderDao dao) {
		this.dao = dao;
	}

}
