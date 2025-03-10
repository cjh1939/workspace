package com.green.react_shop.service;

import com.green.react_shop.dto.ItemDTO;
import com.green.react_shop.mapper.ItemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService{
  private final ItemMapper itemMapper;



  @Override
  public void itemInsert(ItemDTO itemDTO) {
    itemMapper.itemInsert(itemDTO);
  }

  @Override
  public ItemDTO selectItemNum(int itemNum) {
    return itemMapper.selectItemNum(itemNum);
  }

  @Override
  public List<ItemDTO> selectItemList(ItemDTO itemDTO) {
    return itemMapper.selectItemList(itemDTO);
  }

  @Override
  public void updateItem(ItemDTO itemDTO) {
    itemMapper.updateItem(itemDTO);
  }


}
