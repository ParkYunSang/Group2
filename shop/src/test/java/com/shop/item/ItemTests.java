package com.shop.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Item;
import com.shop.service.ItemService;

@SpringBootTest
class InsertTests {
	
	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		Item item = new Item(0,"면바지",12000,null,4);
		try {
			service.register(item);
			System.out.println("Ok");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}
