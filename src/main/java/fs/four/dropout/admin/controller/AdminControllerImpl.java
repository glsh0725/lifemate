package fs.four.dropout.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminControllerImpl implements AdminController {

    @GetMapping("/admin")
    public String adminPage() {
        return "admin/admin";
    }
}
