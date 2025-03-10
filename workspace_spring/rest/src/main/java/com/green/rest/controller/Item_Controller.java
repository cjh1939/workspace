package com.green.rest.controller;


import com.green.rest.dto.ItemDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/restItem")
//@RequestMapping("/rest-item")
//@RequestMapping("/item")
@RestController
public class Item_Controller {


  //모든 상품을 조회하는 기능
  @GetMapping("")
  public void getItem(){
    System.out.println("ddd");
  }

  //상품 하나를 조회하는 기능을 제공하는 rest api
  @GetMapping("/{itemColor}")
  public void Item1(@PathVariable("itemColor") String itemColor){
    log.info(itemColor);
  }

  //상품하나를 등록하는 가능을 제공하는 rest api
  @PostMapping("")
  public void itemIn(@RequestBody ItemDTO itemDTO){
    log.info(itemDTO.toString());
  }

  //상품하나를 삭제하는 가능을 제공하는 rest api
  @DeleteMapping("/{itemCode}")
  public void itemDe(@PathVariable("itemCode") int itemCode){
    log.info("itemCode = " + itemCode);
  }

  //상품하나의 상품명과 가격, 색상을 변경하는 기능 제공
  @PutMapping("/{itemCode}")
public void itemPu(@PathVariable("itemCode") int itemCode, @RequestBody ItemDTO itemDTO){
    log.info("itemCode = " + itemCode);
    log.info(itemDTO.toString());
}

























}
