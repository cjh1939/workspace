package com.green.member_manager.service;


import com.green.member_manager.DTO.MemberDTO;
import com.green.member_manager.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//MemberServiceImpl memberServiceImpl = new MemberServiceImpl();
@Service
public class MemberServiceImpl  implements Memberservice{
    private MemberMapper memberMapper;

    @Autowired
    public MemberServiceImpl(MemberMapper memberMapper){
      this.memberMapper =memberMapper;
    }

// 회원목록 조회 기능
  @Override
  public List<MemberDTO> selectMemberList(MemberDTO memberDTO) {
    return memberMapper.selectMemberList(memberDTO);
  }

  @Override
  public void insertMember(MemberDTO memberDTO) {
    memberMapper.insertMember(memberDTO);
  }

  @Override
  public MemberDTO selectAllMemberList(String memId) {
    return memberMapper.selectAllMemberList(memId);
  }

  @Override
  public void deleteMemberList(String memId) {
    memberMapper.deleteMemberList(memId);
  }

  @Override
  public void updateMember(MemberDTO memberDTO) {
    memberMapper.updateMember(memberDTO);
  }


}
