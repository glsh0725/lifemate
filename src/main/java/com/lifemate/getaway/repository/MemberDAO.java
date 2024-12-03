package com.lifemate.getaway.repository;

import com.lifemate.getaway.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

@Mapper
public interface MemberDAO {

    // 회원 추가
    public int insertMember(MemberVO memberVO) throws DataAccessException;

    // 로그인
    public MemberVO loginById(MemberVO memberVO) throws DataAccessException;
}
