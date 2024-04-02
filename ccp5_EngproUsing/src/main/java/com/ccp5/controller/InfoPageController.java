package com.ccp5.controller;

import org.springframework.stereotype.Controller;
//요청경로와 관련된 메소드 작성
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller //컨트롤러라는걸 알려주는 어노테이션
@RequestMapping("/info/*")
public class InfoPageController {//클래스 선언

   
    @GetMapping("/introduce")
    public void showInfoPage(Model model) {
       
    }

    // 기타 페이지에 필요한 메소드 등을 추가할 수 있음

}



