package com.ccp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/teammembers*")
public class TeamMembers {//클래스 선언

	
	@GetMapping("/introduceTeamMembers")
	public void showTeamMembers(Model model) {
		
	}
}
