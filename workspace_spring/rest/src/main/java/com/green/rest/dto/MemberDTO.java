package com.green.rest.dto;

//DTO(data transfer object : 데이터 전송 객체 )


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class MemberDTO {

  private String memId;
  private String memName;
  private int memAge;
  private String memTel;



}
