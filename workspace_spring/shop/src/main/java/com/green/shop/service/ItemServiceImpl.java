package com.green.shop.service;


import com.green.shop.DTO.ItemDTO;
import com.green.shop.mapper.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//핵심기능 구현
//핵심기능은 쿼리 실행이라고 생각하면 된다.
// -> 쿼리실행을 위해서는 ShopMapper 인터페이스의 객체가 있어야한다.
@Service
public class ItemServiceImpl implements ItemService {
  private ShopMapper shopMapper;

  @Autowired
  public ItemServiceImpl(ShopMapper shopMapper){
    this.shopMapper = shopMapper;
  }

  //상품 등록 기능 메서드
  @Override
  public int insert(ItemDTO shopDTO) {
    System.out.println("상품의 재고를 확인한다");
    System.out.println("상품에 이상이없는지 확인한다");
    //상품을 등록한다 -> 쿼리실행
   int result = shopMapper.insertItem(shopDTO);
    System.out.println("잘 등록됐는지 확인한다.");
    return result;
  }

  //모든상품의 상품번호 상품명 가격 상품등록일을 조회하는기능
  @Override
  public List<ItemDTO> select() {
    return shopMapper.select();
  }
//상품번호를 통해 해당 상품의 모든 컬럼을 조회하는기능
  @Override
  public ItemDTO getItemCode(int itemCode) {
    return shopMapper.getItemCode(itemCode);

  }
  //특정상품번호에 해당하는 상품 삭제 쿼리 실행 메서드
  @Override
  public void deleteItem(int itemCode) {
     shopMapper.deleteItem(itemCode);
  }

  @Override
  public void updateItem(ItemDTO itemDTO) {
      shopMapper.updateItem(itemDTO);
  }





}
