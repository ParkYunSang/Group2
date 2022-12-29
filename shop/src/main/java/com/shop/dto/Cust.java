package com.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Cust {
	private int cust_id;
	private String user_id;
	private String pwd;
	private String name;
	private String tel;
	private String email;
	private char gender;
}
