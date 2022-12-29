package com.shop.cart;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Cart;
import com.shop.service.CartService;

@SpringBootTest
class selectAllTests {
	
	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		List<Cart> carts;
		try {
			carts=service.get();
			for(Cart cart:carts)
				System.out.println(cart);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}