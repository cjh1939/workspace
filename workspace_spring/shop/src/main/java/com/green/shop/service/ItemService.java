package com.green.shop.service;


import com.green.shop.DTO.ItemDTO;

import java.util.List;

//핵심 기능을 정의한 인터페이스
//핵심기능 : 쿼리 작업
public interface ItemService {
  //상품 등록 기능 메서드
  public int insert(ItemDTO shopDTO);


//모든상품의 상품번호 상품명 가격 상품등록일을 조회하는기능
public List<ItemDTO> select();

  //상품번호를 통해 해당 상품의 모든컬럼을 조회하는 기능
  public ItemDTO getItemCode(int itemCode);
  //특정상품번호에 해당하는 상품 삭제 쿼리 실행 메서드
  public void deleteItem(int itemCode);
  //업데이트 기능 실행 메서드
  public void updateItem(ItemDTO itemDTO);






}
