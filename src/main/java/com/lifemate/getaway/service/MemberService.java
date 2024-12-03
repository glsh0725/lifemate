package com.lifemate.getaway.service;

import com.lifemate.getaway.vo.MemberVO;

import java.util.List;

public interface MemberService {

    // 회원 리스트
    public List listMembers() throws Exception;

    // 회원 추가
    public int addMember(MemberVO memberVO) throws Exception;

    // 로그인
    public MemberVO login(MemberVO memberVO) throws Exception;
}
