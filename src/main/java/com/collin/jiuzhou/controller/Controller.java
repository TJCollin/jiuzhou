package com.collin.jiuzhou.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/html")
    public String html() {
        return "/index.html";
    }
}
