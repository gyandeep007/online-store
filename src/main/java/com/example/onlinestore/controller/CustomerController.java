package com.example.onlinestore.controller;


import com.example.onlinestore.entities.Customer;
import com.example.onlinestore.service.CustomerService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("customers")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "{customerId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Customer getCustomerById(@PathVariable Long customerId){
        return customerService.getCustomerById(customerId);
    }
    @GetMapping()
    public List<Customer> getCustomerList(){
        return customerService.getCustomerList();
    }
}
