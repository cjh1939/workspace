package com.green.rest.controller;

import com.green.rest.dto.MemberDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

//객체 생성 + 관제탑 역할 부여
//이 클래슨느 모든 요청(url)을 받는 클래스
@RestController
@RequestMapping("/members")
@Slf4j
public class MemberController {

  @GetMapping("")
  public void getMemberList(){
    System.out.println("getMemberList() 메서드 실행");
  }

  @PostMapping("")
  public void insertMember(@RequestBody MemberDTO boardDTO){
    System.out.println("insertMember 메서드 실행");
    System.out.println(boardDTO.toString());
  }




// 회원한명을 조회하는 기능
//rest -> localhost: 8080/members/AAA
//URL 에 {} 로 표현되는 내용은 값을 받아올 때 사용
  @GetMapping("/{age}")
  public void getMember(@PathVariable("age") int a  ){
    System.out.println("getMember() 메서드 실행");
    System.out.println("a = " + a);
  }

  // rest -> localhost:8080/memebers/java/20
  @GetMapping("/{memID}/{memAge}")
  public void getMemver2(@PathVariable("memID") String memID,@PathVariable("memAge") int memAge){
    System.out.println("memId = " + memID);
    System.out.println("memAge = " + memAge);
  }

// 회원 한명을 삭제하는 기능을 제공하는 rest api


  //DELETE = localhost:8080/members/aaa
  @DeleteMapping("/{memId}")
  public void delte(@PathVariable("memId")String memId  ){
    log.info("멤버 아이디"+ memId);
  }

  //회원 한명의 이름과 나이를 변경하는 기능을 제공하는 rest api
  //(PUT) localhost:8080/members/aaa
  @PutMapping("/{memId}")
  public void updateMember(@PathVariable("memId") String memId, @RequestBody MemberDTO memberDTO ){
    log.info("회원 한명의 정보 변경");
    log.info("memid = " + memId);
    log.info("memberDto = "+ memberDTO);
  }







}
