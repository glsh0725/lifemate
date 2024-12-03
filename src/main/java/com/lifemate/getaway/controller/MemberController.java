package com.lifemate.getaway.controller;

import com.lifemate.getaway.vo.MemberVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public interface MemberController {

    // 회원 리스트
    public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception;

    // 회원 추가
    public ModelAndView addMember(@ModelAttribute("info") MemberVO memberVO,
                                  HttpServletRequest request, HttpServletResponse response) throws Exception;

    // 로그인
    public ModelAndView login(@ModelAttribute("member")MemberVO memberVO,
                              RedirectAttributes redirectAttributes,
                              HttpServletRequest request, HttpServletResponse response) throws Exception;
}
