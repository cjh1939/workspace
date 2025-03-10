package com.green.board.DTO;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@ToString
@Getter
@Setter
public class ReplyDTO {
  private int replyNum;
  private String content;
  private String writer;
  private LocalDateTime regDate;
  private int boardNum;

}
