package com.example.onlinestore.controller;


import com.example.onlinestore.dto.Payment;
import com.example.onlinestore.entities.Customer;
import com.example.onlinestore.entities.Order;
import com.example.onlinestore.service.CustomerService;
import com.example.onlinestore.service.OrderService;
import com.example.onlinestore.service.PaymentService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders")
@CrossOrigin
public class OrderController {

    private OrderService orderService;
    private PaymentService paymentService;

    public OrderController(OrderService orderService,PaymentService paymentService) {
        this.orderService = orderService;
        this.paymentService=paymentService;
    }

    @GetMapping(value = "{customerId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Order getOrderById(@PathVariable Long customerId){
        return orderService.getOrderById(customerId);
    }
    @GetMapping()
    public List<Order> getOrderList(){
        return orderService.getOrderList();
    }

    @GetMapping("payments/{orderId}")
    public Payment getPaymentByOrderId(@PathVariable Long orderId){


        return paymentService.getPaymentByOrderId(orderId);
    }
}
