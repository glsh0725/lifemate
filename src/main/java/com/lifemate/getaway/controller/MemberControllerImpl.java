package com.lifemate.getaway.controller;

import com.lifemate.getaway.service.MemberService;
import com.lifemate.getaway.vo.MemberVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller("memberController")
public class MemberControllerImpl implements MemberController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberVO memberVO;

    @Override
    @PostMapping("/member/addMember.do")
    public ModelAndView addMember(@ModelAttribute("member") MemberVO member,
                                  HttpServletRequest request, HttpServletResponse response) throws Exception{
        request.setCharacterEncoding("utf-8");
        int result = 0;
        result = memberService.addMember(member);
        ModelAndView mav = new ModelAndView("redirect:/member/listMember.do");
        return mav;
    }

    @Override
    @PostMapping("/member/login.do")
    public ModelAndView login(@ModelAttribute("member") MemberVO member,
                              RedirectAttributes rAttr,
                              HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView();
        memberVO = memberService.login(member);

        if (memberVO != null) {
            HttpSession session = request.getSession();
            session.setAttribute("member", memberVO);
            session.setAttribute("isLogOn", true);

            String action = (String) session.getAttribute("action");
            session.removeAttribute("action");

            if (action != null) {
                mav.setViewName("redirect: " + action);
            } else {
                mav.setViewName("redirect:/member/listMembers.do");
            }
        } else {
            rAttr.addAttribute("result", "loginFailed");
            mav.setViewName("redirect:/member/loginForm.do");
        }
        return mav;
    }
}
