package com.green.react_shop.dto;


import lombok.*;

import java.time.LocalDateTime;

//@NoArgsConstructor //매개변수 없는 생성자
//@AllArgsConstructor//변수가 있는 생성자
//@RequiredArgsConstructor


@ToString
@Setter
@Getter
public class ItemDTO {
  private  int itemNum;
  private  String itemName;
  private  int  itemPrice;
  private String seller;
  private String itemIntro;
  private LocalDateTime regDate;






}
