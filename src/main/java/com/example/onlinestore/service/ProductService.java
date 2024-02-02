package com.example.onlinestore.service;

import com.example.onlinestore.entities.Customer;
import com.example.onlinestore.entities.Product;
import com.example.onlinestore.repository.CustomerRepository;
import com.example.onlinestore.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public Product getProductById(Long productId){
        if(productId == null)
            throw new IllegalArgumentException("customer id is not valid");

    //    return customerRepository.findById(customerId).orElseThrow(()->new NoSuchElementException("customer not found"));
        return productRepository.findById(productId).get();
    }

    public List<Product> getProductList(){

        return productRepository.findAll();
    }


}
