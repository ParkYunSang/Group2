package com.shop.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Order;
import com.shop.service.OrderService;

@SpringBootTest
class InsertTests {
	
	@Autowired
	OrderService service;
	
	@Test
	void contextLoads() {
		Order ord = new Order(0,103,15000,"서울","박경태",101,"배송준비",3);
		try {
			service.register(ord);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			//e.printStackTrace();
		}
	}

}