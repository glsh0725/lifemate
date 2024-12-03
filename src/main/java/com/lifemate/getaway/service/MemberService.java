package com.lifemate.getaway.service;

import com.lifemate.getaway.vo.MemberVO;

public interface MemberService {

    // 회원 추가
    public int addMember(MemberVO memberVO) throws Exception;

    // 로그인
    public MemberVO login(MemberVO memberVO) throws Exception;
}
