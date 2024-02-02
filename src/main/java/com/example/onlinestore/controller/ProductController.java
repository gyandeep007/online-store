package com.example.onlinestore.controller;


import com.example.onlinestore.entities.Customer;
import com.example.onlinestore.entities.Product;
import com.example.onlinestore.service.CustomerService;
import com.example.onlinestore.service.ProductService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
@CrossOrigin
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "{customerId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Product getProductById(@PathVariable Long customerId){
        return productService.getProductById(customerId);
    }
    @GetMapping()
    public List<Product> getProductList(){
        return productService.getProductList();
    }
}
