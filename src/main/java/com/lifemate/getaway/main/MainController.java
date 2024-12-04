package com.lifemate.getaway.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public interface MainController {

    @GetMapping("/main")
    public String mainPage() {
        return "main/main";
    }
}
