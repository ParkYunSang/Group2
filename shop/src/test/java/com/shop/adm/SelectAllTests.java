package com.shop.adm;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Adm;
import com.shop.service.AdmService;

@SpringBootTest
class SelectAllTests {
	
	@Autowired
	AdmService service;
	
	@Test
	void contextLoads() {
		List<Adm> adms = null;
		try {
			adms = service.get();
			for(Adm adm:adms) {
				System.out.println(adm);
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
