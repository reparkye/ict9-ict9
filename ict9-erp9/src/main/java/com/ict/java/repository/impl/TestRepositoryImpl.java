package com.ict.java.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ict.java.repository.TestRepository;
import com.ict.java.vo.TestVo;


@Repository
public class TestRepositoryImpl implements TestRepository {

	@Override
	public List<TestVo> getTestList() {
		List<TestVo> tList = new ArrayList<TestVo>();
		for(int i=1;i<=5;i++) {
			TestVo tvo = new TestVo();
			tvo.setName("name" + i);
			tvo.setId("id"+ i);
			tList.add(tvo);
		}
		return tList;
	}

}
