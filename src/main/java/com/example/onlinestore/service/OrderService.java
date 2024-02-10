package com.example.onlinestore.service;

import com.example.onlinestore.entities.Order;
import com.example.onlinestore.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    public OrderService(OrderRepository customerRepository) {
        this.orderRepository = customerRepository;
    }


    public Order getOrderById(Long orderId){
        if(orderId == null)
            throw new IllegalArgumentException("order id is not valid");

    //    return customerRepository.findById(customerId).orElseThrow(()->new NoSuchElementException("customer not found"));
        return orderRepository.findById(orderId).get();
    }

    public List<Order> getOrderList(){

        return orderRepository.findAll();
    }


}
