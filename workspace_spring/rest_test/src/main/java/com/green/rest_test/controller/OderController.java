package com.green.rest_test.controller;

import com.green.rest_test.DTO.OredDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController

public class OderController {
  //모든 상품을 조회하는 기능
  @GetMapping ("/restTest")
  public List<OredDTO> test1(){
    List<OredDTO> l1 =new ArrayList<>();

    l1.add(new OredDTO(5,"데님 청바지",15000,2,"abc",30000));
    l1.add(new OredDTO(4,"맨투맨 반팔 티셔츠",10000,3,"abc1",30000));
    l1.add(new OredDTO(3,"오버핏 니트",25000,2,"abc2",50000));
    l1.add(new OredDTO(2,"롱패딩",55000,1,"abc3",55000));
    l1.add(new OredDTO(1,"맨투맨 긴팔 티셔츠",12000,3,"abc4",36000));
    return l1;
  }

  //상품 하나를 조회하는 기능을 제공하는 rest api
  @GetMapping("/restTest/{itemCode}")
  public void Item1(@PathVariable("itemCode") String itemCode) {
    System.out.println("상품 1개 조회");
    log.info(itemCode);
  }

  //상품하나를 등록하는 가능을 제공하는 rest api
  @PostMapping("/restTest")
  public void itemIn(@RequestBody OredDTO oredDTO) {
    log.info(oredDTO.toString());
  }

  //상품하나를 삭제하는 가능을 제공하는 rest api
  @DeleteMapping("/restTest/{itemCode}")
  public void itemDe(@PathVariable("itemCode") int itemCode) {
    log.info("itemCode = " + itemCode);
  }

  //상품하나의 상품명과 가격, 색상을 변경하는 기능 제공
  @PutMapping("/restTest/{itemCode}")
  public void itemPu(@PathVariable("itemCode") int itemCode, @RequestBody OredDTO oredDTO) {
    log.info("itemCode = " + itemCode);
    log.info(oredDTO.toString());
  }
}