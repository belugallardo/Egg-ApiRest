package com.example.ApiRest.converter;

import com.example.ApiRest.dto.OrderDto;
import com.example.ApiRest.entity.Order;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class OrderMapper {

    private final ModelMapper modelMapper;

    public OrderMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public OrderDto convertToDto (Order order){
        return modelMapper.map(order, OrderDto.class);
    }

    public Order convertToEntity (OrderDto orderDto){
        return modelMapper.map(orderDto, Order.class);
    }
}
