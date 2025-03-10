package com.green.react_shop.service;


import com.green.react_shop.dto.ItemDTO;
import com.green.react_shop.dto.OrderDTO;
import com.green.react_shop.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderMapper orderMapper;


    @Override
    public void insertOrder(OrderDTO orderDTO) {
        orderMapper.insertOrder(orderDTO);
    }

    @Override
    public List<ItemDTO> orderSelectList() {
        return orderMapper.orderSelectList();
    }


}

