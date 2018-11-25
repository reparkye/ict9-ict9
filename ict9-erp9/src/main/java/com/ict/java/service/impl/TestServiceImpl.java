package com.ict.java.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.java.repository.TestRepository;
import com.ict.java.service.TestService;
import com.ict.java.vo.TestVo;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestRepository tr;
	
	
	@Override
	public List<TestVo> getTestList() {
		return tr.getTestList();
	}
}
