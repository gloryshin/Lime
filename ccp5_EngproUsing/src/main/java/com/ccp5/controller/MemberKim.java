package com.ccp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/eachmember*")
public class MemberKim {
	
	@GetMapping("/kim")
	public void showMemberKim(Model model) {
		
	}

}
