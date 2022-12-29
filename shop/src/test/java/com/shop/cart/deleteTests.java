package com.shop.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.service.CartService;

@SpringBootTest
class deleteTests {
	
	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(102);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}