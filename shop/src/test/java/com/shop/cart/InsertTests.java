package com.shop.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Cart;
import com.shop.service.CartService;

@SpringBootTest
class InsertTests {
	
	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		Cart cart = new Cart(0,101,3,null,100);
		try {
			service.register(cart);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}