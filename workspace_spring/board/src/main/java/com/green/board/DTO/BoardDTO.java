package com.green.board.DTO;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@ToString
@Setter
@Getter
public class BoardDTO {
  private int boardNum;
  private  String title;
  private  String writer;
  private  String content;
  private  int readCnt;
  private LocalDateTime regDate;


}
