package com.shop.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Cust;
import com.shop.service.CustService;

@SpringBootTest
class UpdateTests {

	@Autowired
	CustService service;
	
	@Test
	void contextLoads() {
		Cust cust = new Cust(105,"user05","pwd055","홍길동","010-1111-2222","gildong@naver.com",'F');
		try {
			service.modify(cust);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}
