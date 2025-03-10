package com.green.rest.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class BoarDTO {
  private int  board_num;
  private String title;
  private String content;
  private String writer;
}
