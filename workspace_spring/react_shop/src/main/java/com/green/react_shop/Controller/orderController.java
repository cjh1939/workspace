package com.green.react_shop.Controller;


import com.green.react_shop.dto.ItemDTO;
import com.green.react_shop.dto.OrderDTO;
import com.green.react_shop.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("orders")
@RestController
@RequiredArgsConstructor
public class orderController {
  private final OrderService orderService;


  @PostMapping("")
  public void insertOrder(@RequestBody OrderDTO orderDTO){
    orderService.insertOrder(orderDTO);
  }

  @GetMapping("")
public List<ItemDTO> orderSelectList(){
    return orderService.orderSelectList();
}


}
