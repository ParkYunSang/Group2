package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.dto.Order;
import com.shop.frame.MyMapper;

@Repository
@Mapper
public interface OrderMapper extends MyMapper<Integer,Order> {
	public List<Order> searchDeli(String deli) throws Exception;
}
