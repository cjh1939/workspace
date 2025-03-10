package com.green.react_shop.service;

import com.green.react_shop.dto.ItemDTO;

import java.util.List;

public interface ItemService {

  public void itemInsert(ItemDTO itemDTO);

  public ItemDTO selectItemNum(int itemNum);

  public List<ItemDTO> selectItemList (ItemDTO itemDTO);

  public void updateItem(ItemDTO itemDTO);
}
