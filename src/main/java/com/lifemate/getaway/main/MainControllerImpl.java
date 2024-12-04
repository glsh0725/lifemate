package com.lifemate.getaway.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControllerImpl implements MainController {

    @GetMapping("/main")
    public String mainPage() {
        return "main/main";
    }
}
