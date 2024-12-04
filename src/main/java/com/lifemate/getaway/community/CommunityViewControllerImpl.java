package com.lifemate.getaway.community;

import org.springframework.web.bind.annotation.GetMapping;

public class CommunityViewControllerImpl implements CommunityViewController {

    @GetMapping("/communityview")
    public String communityviewPage() {
        return "community/communityview";
    }
}
