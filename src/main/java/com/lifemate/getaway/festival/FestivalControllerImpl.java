package com.lifemate.getaway.festival;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FestivalControllerImpl implements FestivalController {

    // 컨트롤러 옮김
    @GetMapping("/festival")
    public String festivalPage() {
        return "festival/festival";
    }
}
