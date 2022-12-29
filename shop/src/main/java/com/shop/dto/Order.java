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
public class Order {
	private int order_id;
	private int cust_id;
	private int price;
	private String location;
	private String pay_id;
	private int item_id;
	private String delivery_status;
	private int cnt;
}
