package com.example.onlinestore.controller;


import com.example.onlinestore.entities.Order;
import com.example.onlinestore.entities.OrderItem;
import com.example.onlinestore.service.OrderItemService;
import com.example.onlinestore.service.OrderService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("order-items")
public class OrderItemController {

    private OrderItemService orderItemService;

    public OrderItemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @GetMapping(value = "{customerId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public OrderItem getOrderItemById(@PathVariable Long customerId){
        return orderItemService.getCustomerById(customerId);
    }
    @GetMapping()
    public List<OrderItem> getOrderItemList(){
        return orderItemService.getCustomerList();
    }
}
