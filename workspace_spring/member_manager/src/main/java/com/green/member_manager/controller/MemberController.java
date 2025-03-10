package com.green.member_manager.controller;

import com.green.member_manager.DTO.MemberDTO;
import com.green.member_manager.service.Memberservice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/members")
@RestController
public class MemberController {
  private Memberservice memberservice;

  @Autowired
  public MemberController(Memberservice memberservice){
    this.memberservice = memberservice;

  }
//  회원목록 조회 쿼리
  @GetMapping("")
  public List<MemberDTO> selectMemberList(MemberDTO memberDTO){
    return memberservice.selectMemberList(memberDTO);

  }
// 등록 쿼리
  @PostMapping("")
  public void insertMember(@RequestBody MemberDTO memberDTO){
    memberservice.insertMember(memberDTO);
  }

  @GetMapping("/{memId}")
  public MemberDTO selectAllMemberList(@PathVariable("memId") String memId){
    return memberservice.selectAllMemberList(memId);
  }

  @DeleteMapping("/{memId}")
  public void deleteMemberList(@PathVariable("memId")String memId){
      memberservice.deleteMemberList(memId);
  }

  @PutMapping("/{memId}")
  public void updateMember(@PathVariable("memId")String memId, @RequestBody MemberDTO memberDTO ){
      memberDTO.setMemId(memId);
      memberservice.updateMember(memberDTO);
  }








}
