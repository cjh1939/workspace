package com.green.react_shop.Controller;


import com.green.react_shop.dto.ItemDTO;
import com.green.react_shop.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/items")
@RestController
@RequiredArgsConstructor
public class ItemController {

  private final ItemService itemService;

  //아이템 등록
  @PostMapping("")
  public void itemInsert(@RequestBody ItemDTO itemDTO){
    itemService.itemInsert(itemDTO);
}
//아이템 한개 조회 쿼리
@GetMapping("/{itemNum}")
public ItemDTO selectItemNum(@PathVariable("itemNum")int itemNum){
  return itemService.selectItemNum(itemNum);
}
//전제 목록
@GetMapping("")
public List<ItemDTO> selectItemList(ItemDTO itemDTO){
    return itemService.selectItemList(itemDTO);
}
//아이템 목록 수정
@PutMapping("/{itemNum}")
  public void updateItem(@PathVariable("itemNum") int itemNum, @RequestBody ItemDTO itemDTO){
    itemDTO.setItemNum(itemNum);
    itemService.updateItem(itemDTO);
}







}
