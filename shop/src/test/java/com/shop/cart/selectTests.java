package com.shop.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Cart;
import com.shop.service.CartService;

@SpringBootTest
class selectTests {
	
	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		Cart cart;
		try {
			cart =service.get(101);
			System.out.println("OK");
			System.out.println(cart);
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}