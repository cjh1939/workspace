package com.green.react_shop.mapper;

import com.green.react_shop.dto.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {

  public void itemInsert(ItemDTO itemDTO);

  public ItemDTO selectItemNum(int itemNum);

  public List<ItemDTO> selectItemList (ItemDTO itemDTO);

 public void updateItem(ItemDTO itemDTO);





}
