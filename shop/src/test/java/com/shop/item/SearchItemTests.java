package com.shop.item;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Item;
import com.shop.service.ItemService;

@SpringBootTest
class SearchItemTests {
	
	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		List<Item> items = null;
		try {
			items = service.searchItem("청");
			for(Item item:items) {
				System.out.println(item);
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}
