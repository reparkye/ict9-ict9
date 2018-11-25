package com.ict.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ict.java.vo.TestVo;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class TestController {

	@GetMapping("/tests")
	public String test() {
		return "tests";
	}
	
	@GetMapping("/tests/1")		
	public String test(@ModelAttribute TestVo tvo) {	//모델어트리뷰트는 리콰이어드가 트루가 아니다 생략이 가능하다, 키밸류
		log.debug("param tvo=>{}",tvo);
		return "tests";
	}	
	
	
	@GetMapping("/tests/{id}/{test}")
	public String test(@PathVariable("id")String id, @RequestParam("id2") String id2) {	
		log.debug("param id=>{}",id);
		log.debug("param id2=>{}",id2);
		return "tests";
	}
	
	
	@PostMapping("/tests")
	public String tests(@ModelAttribute TestVo tvo, Model m) {
		log.debug("param tvo=>{}",tvo);
		m.addAttribute("tvo",tvo);
		return "tests";
	}
	
}
