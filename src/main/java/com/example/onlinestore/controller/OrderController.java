package com.example.onlinestore.controller;


import com.example.onlinestore.entities.Customer;
import com.example.onlinestore.entities.Order;
import com.example.onlinestore.service.CustomerService;
import com.example.onlinestore.service.OrderService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders")
@CrossOrigin
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(value = "{customerId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Order getOrderById(@PathVariable Long customerId){
        return orderService.getCustomerById(customerId);
    }
    @GetMapping()
    public List<Order> getOrderList(){
        return orderService.getCustomerList();
    }
}
