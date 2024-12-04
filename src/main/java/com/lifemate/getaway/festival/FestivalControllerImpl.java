package com.lifemate.getaway.festival;

import org.springframework.web.bind.annotation.GetMapping;

public class FestivalControllerImpl implements FestivalController {

    @GetMapping("/festival")
    public String festivalPage() {
        return "festival/festival";
    }
}
