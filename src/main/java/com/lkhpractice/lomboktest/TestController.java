package com.lkhpractice.lomboktest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lkhpractice.lomboktest.dto.MemberDto;

@RestController
public class TestController {
	
	@RequestMapping(value = "/test")
	public MemberDto test() {
		
		MemberDto dto = new MemberDto();
		
		dto.setName("홍길동");
		dto.setId("tiger");
		dto.setPw("12345");
		dto.setAge(27);
		
		return dto;
	}
}
