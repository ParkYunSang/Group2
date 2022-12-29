package com.shop.adm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.service.AdmService;

@SpringBootTest
class DeleteTests {
	
	@Autowired
	AdmService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove("adm03");
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

	
}
