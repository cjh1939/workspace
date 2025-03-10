package com.green.member_manager.mapper;

import com.green.member_manager.DTO.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//xml파일에 작성한 쿼리문을 실행시키는 메서드 정의
// @Mapper : 객체생성과  실행메서드  정의
@Mapper
public interface MemberMapper {

  //회원 전체 조회
  public List<MemberDTO> selectMemberList(MemberDTO memberDTO);

  //등록 쿼리
  public void insertMember(MemberDTO memberDTO);

 //회원 한명 조회
  public MemberDTO selectAllMemberList(String memId);

  //회원 데이터 삭제
  public void deleteMemberList(String memId);

  //회원 수정
  public void updateMember(MemberDTO memberDTO);

}
