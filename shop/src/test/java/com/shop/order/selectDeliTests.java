package com.shop.order;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Order;
import com.shop.service.OrderService;

@SpringBootTest
class selectDeliTests {
	
	@Autowired
	OrderService service;
	
	@Test
	void contextLoads() {
		List<Order> ords;
		try {
			ords=service.searchdeli("배송완료");
			for(Order ord:ords)
				System.out.println(ord);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			//e.printStackTrace();
		}
	}

}