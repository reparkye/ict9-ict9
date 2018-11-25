package com.ict.java.vo;

import java.util.List;

import lombok.Data;

@Data
public class TestVo {

		private String id;
		private String name;
		private List<String> strList;	//list는 단일값이 아니다.
	}

