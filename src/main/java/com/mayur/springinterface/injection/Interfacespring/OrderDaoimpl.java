package com.mayur.springinterface.injection.Interfacespring;


public class OrderDaoimpl implements OrderDao {
	

	@Override
	public void createOrder() {
   System.out.println("inside the Dao create order Dao");
	}

}
