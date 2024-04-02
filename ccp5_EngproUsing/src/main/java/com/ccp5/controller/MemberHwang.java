package com.ccp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/eachmember*")//템플릿폴더명
public class MemberHwang {

	@GetMapping("/hwang")//html파일명
	public void showMemberHwang(Model model) {//show자바클래스명
		
	}
}
