package com.example.onlinestore.service;

import com.example.onlinestore.entities.Order;
import com.example.onlinestore.entities.OrderItem;
import com.example.onlinestore.repository.OrderItemRepository;
import com.example.onlinestore.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemService {

    private OrderItemRepository orderItemRepository;

    public OrderItemService(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }


    public OrderItem getCustomerById(Long orderItemId){
        if(orderItemId == null)
            throw new IllegalArgumentException("order id is not valid");

    //    return customerRepository.findById(customerId).orElseThrow(()->new NoSuchElementException("customer not found"));
        return orderItemRepository.findById(orderItemId).get();
    }

    public List<OrderItem> getCustomerList(){

        return orderItemRepository.findAll();
    }


}
