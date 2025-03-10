package com.green.member_manager.service;

import com.green.member_manager.DTO.MemberDTO;

import java.util.List;

public interface Memberservice {

  //목록 조회 기능
  public List<MemberDTO> selectMemberList(MemberDTO memberDTO);

  //회원 등록 기능
  public void insertMember(MemberDTO memberDTO);

//회원 한명 조회
  public MemberDTO selectAllMemberList(String memId);

  //삭제
  public void deleteMemberList(String memId);

  public void updateMember(MemberDTO memberDTO);

}
