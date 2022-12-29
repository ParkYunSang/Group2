package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.Cust;
import com.shop.frame.MyService;
import com.shop.mapper.CustMapper;

@Service
public class CustService implements MyService<Integer,Cust>{
	@Autowired
	CustMapper mapper;

	@Override
	public void register(Cust v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(Cust v) throws Exception {
		mapper.update(v);
	}

	@Override
	public Cust get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Cust> get() throws Exception {
		return mapper.selectall();
	}
}
