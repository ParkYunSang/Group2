package com.shop.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Cart{
	
	@NonNull
	private int cart_id;
	
	@NonNull
	private int cust_id;
	
	@NonNull
	private int item_id;
	
	@NonNull
	private int cnt;
	private Date rdate;
	
}
