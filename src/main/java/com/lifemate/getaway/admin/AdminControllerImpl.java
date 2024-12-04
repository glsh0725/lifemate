package com.lifemate.getaway.admin;

import org.springframework.web.bind.annotation.GetMapping;

public class AdminControllerImpl implements AdminController {

    @GetMapping("/admin")
    public String adminPage() {
        return "admin/admin";
    }
}
