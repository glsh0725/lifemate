package com.lifemate.getaway.festival;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public interface FestivalController {

    // 인터페이스는 추상 메소드를 가질 수 없음 Impl로 옮겨야 함.
/*    @GetMapping("/festival")
    public String festivalPage() {
        return "festival/festival";
    }*/
}
