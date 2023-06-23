package com.sparta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
    private static long visitCount = 0;

    // static폴더 안에 정적파일 반환하기
    // thymeleaf Template engine은 templates에서 html을 찾으므로
    // thymeleaf 제거해야 동작
    @GetMapping("/static-hello")
    public String hello() {
        return "hello.html";
    }

    // redirect
    // thymeleaf 적용 상태에서 정적파일 넘겨줄 수 있음
    // 위 요청이 재수행되면서 static 폴더의 파일 반환 가능
    @GetMapping("/html/redirect")
    public String htmlStatic() {
        return "redirect:/hello.html";
    }

    // Template engine에 View 전달
    @GetMapping("/html/templates")
    public String htmlTemplates() {
        return "hello";
    }

    // 동적 파일 전달하기
    @GetMapping("/html/dynamic")
    public String htmlDynamic(Model model) {
        visitCount++;
        model.addAttribute("visits", visitCount);
        return "hello-visit";
    }
}
