package com.shop.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Order;
import com.shop.service.OrderService;

@SpringBootTest
class UpdateTests {
	
	@Autowired
	OrderService service;
	
	@Test
	void contextLoads() {
		Order ord = new Order(100,102,0,"서울","정슬기",101,"배송중",2);
		try {
			service.modify(ord);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			//e.printStackTrace();
		}
	}

}