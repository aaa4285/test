package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping("/")
	public String welcom() {
		System.out.println("das");
		return "test";
	}
	
	@RequestMapping("/login/kakao")
	public @ResponseBody String loginKakao() {
		System.out.println("test");
		return "aa";
	}
}
