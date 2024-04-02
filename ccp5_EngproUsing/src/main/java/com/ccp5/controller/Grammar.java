package com.ccp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/detailpages*")//템플릿내폴더명
public class Grammar {

	@GetMapping("/grm")//html파일명
	public void showGrammar(Model model) {//show자바클래스명
		
	}
}
