package com.lifemate.getaway.repository;

import com.lifemate.getaway.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import java.util.List;

@Mapper
public interface MemberDAO {
    // 회원 리스트
    public List selectAllMemberList() throws DataAccessException;

    // 회원 추가
    public int insertMember(MemberVO memberVO) throws DataAccessException;

    // 로그인
    public MemberVO loginById(MemberVO memberVO) throws DataAccessException;
}
