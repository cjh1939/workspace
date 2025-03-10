package com.green.shop.controller;

import com.green.shop.DTO.ItemDTO;
import com.green.shop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/items")
@RestController
public class ShopController {

  private ItemService shopService;

  @Autowired
  public ShopController(ItemService shopService){
    this.shopService= shopService;
  }

  //상품 하나를 등록하는기능
  @PostMapping("")
  public void regItem(@RequestBody ItemDTO ShopDTO){
    System.out.println(ShopDTO);
    //매개변수에는 shopDTO 자료형이 들어와야함
    //매개변수로 쿼리의 빈값을 채워 줄거임

    //-> 상품명, 상품가격, 상품설명 3개 데이터가
    //들어있는 shopDTO객체를 매개변수로 전달해야함
    shopService.insert(ShopDTO);

  }

  //상품번호를 통해 해당 상품의 모든컬럼을 조회하는 기능
  @GetMapping("")
 public List<ItemDTO> select(){
   List<ItemDTO> itemDTOList = shopService.select();
   return itemDTOList;
 }
 //상품번호를 통해 해당 상품의 모든 컬럼을 조회하는기능
@GetMapping("/{itemCode}")
public ItemDTO getItemCode(@PathVariable("itemCode") int code){
   return shopService.getItemCode(code);
}

@DeleteMapping("/{itemCode}")
  public void deletItem(@PathVariable("itemCode") int itemCode){
     shopService.deleteItem(itemCode);
}

@PostMapping ("/update")
public  void  updateItem(@RequestBody ItemDTO itemDTO ){
    shopService.updateItem(itemDTO);
}
@PutMapping("/{itemCode}")
public void updateItem2(@PathVariable("itemCode") int itemCode, @RequestBody ItemDTO itemDTO ){
    itemDTO.setItemCode(itemCode);

   shopService.updateItem(itemDTO);
}




}
