package com.green.shop.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
//DTO 클래스 :하나의 테이블과 데이터를 주고받기위한 자료형
@ToString
@Setter
@Getter
public class ItemDTO {
  private int itemCode;
  private String itemName;
  private int itemPrice;
  private String itemIntro;
  private Timestamp regDate;
}
