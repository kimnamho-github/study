package com.example.study.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j 
@Controller("mainController")
public class MainController {

    @GetMapping(value = "")
    public String main(Model model) {
        try {
            
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return "notice_list";
    }

    @GetMapping(value = "/add")
    public String noticeAdd(Model model) {
        try {
            
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return "notice_add";
    }
 
}