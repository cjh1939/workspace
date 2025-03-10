package com.green.board.DTO;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class SearchDTO {
  private String searchValue;
  private String searchKeyword;
}
