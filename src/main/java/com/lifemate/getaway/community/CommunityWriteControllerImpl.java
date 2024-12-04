package com.lifemate.getaway.community;

import org.springframework.web.bind.annotation.GetMapping;

public class CommunityWriteControllerImpl implements CommunityWriteController {

    @GetMapping("/communitywrite")
    public String communitywritePage() {
        return "community/communitywrite";
    }
}
