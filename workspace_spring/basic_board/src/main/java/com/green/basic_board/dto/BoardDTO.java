package com.green.basic_board.dto;

import ch.qos.logback.core.joran.action.TimestampAction;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.sql.Timestamp;

@Getter
@Setter
@ToString

public class BoardDTO {
  private int boardNum;
  private String title;
  private String wrtier;
  private String conente;
  private int readCnt;
  private Timestamp createDate;
}
