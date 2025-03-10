package com.green.shop.mapper;


import com.green.shop.DTO.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//객체생성 + 해당 파일에 쿼리를 실행시킬 메서드가 정의되어 잇다는것을
//인지시켜줌

//메서드의 리턴타입 : 쿼리 실행결과를 가져올 자료형
@Mapper
public interface ShopMapper  {

  //상품하나를 등록하는 쿼리 실행 메서드
  public int insertItem(ItemDTO shopDTO);

  //모든상품의 상품번호 상품명 가격 상품등록일을 조회하는기능
  public List<ItemDTO> select();

  //상품번호를 통해 해당 상품의 모든컬럼을 조회하는 기능
  public ItemDTO getItemCode(int itemCode);

  //상품 삭제 하는 쿼리
  public void deleteItem(int itemCode);

//상품 번호에 해당하느 상품의 상품명,가격,상품설명 업데이트 할 쿼리
  public void updateItem(ItemDTO itemDTO);

}
