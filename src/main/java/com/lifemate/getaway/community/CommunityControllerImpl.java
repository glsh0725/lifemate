package com.lifemate.getaway.community;

import org.springframework.web.bind.annotation.GetMapping;

public class CommunityControllerImpl implements CommunityController {

    @GetMapping("/community")
    public String communityPage() {
        return "community/community";
    }
}
