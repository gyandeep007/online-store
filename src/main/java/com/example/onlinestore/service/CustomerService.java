package com.example.onlinestore.service;

import com.example.onlinestore.exception.CustomerException;
import com.example.onlinestore.entities.Customer;
import com.example.onlinestore.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public Customer getCustomerById(Long customerId){
        if(customerId == null)
            throw new IllegalArgumentException("customer id is not valid");

    //    return customerRepository.findById(customerId).orElseThrow(()->new NoSuchElementException("customer not found"));
        return customerRepository.findById(customerId).get();
    }

    public List<Customer> getCustomerList(){

        return customerRepository.findAll();
    }


}
