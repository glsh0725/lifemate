package com.lifemate.getaway.community;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public interface CommunityViewController {

    // 인터페이스는 추상 메소드 가질 수 없음 Impl로 옮겨야 함.
    /*@GetMapping("/communityview")
    public String communityviewPage() {
        return "community/communityview";
    }*/
}
