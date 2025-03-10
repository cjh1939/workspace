package com.green.react_shop.service;


import com.green.react_shop.dto.ItemDTO;
import com.green.react_shop.dto.OrderDTO;

import java.util.List;

public interface OrderService {

  public void insertOrder (OrderDTO orderDTO);

  public List<ItemDTO> orderSelectList();

}
