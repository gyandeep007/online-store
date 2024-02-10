package com.example.onlinestore.service;


import com.example.onlinestore.dto.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.persistence.EntityNotFoundException;

@Service
public class PaymentService {

     private RestTemplate restTemplate;
     
     
     public Payment  getPaymentByOrderId(Long orderId){
         restTemplate = new RestTemplate();
         ResponseEntity<Payment> paymentResponse = restTemplate.getForEntity("http://172.17.0.3:8082/payments/orders/" + orderId, Payment.class);
         if(paymentResponse.getStatusCode().value() == 200)
             return paymentResponse.getBody();
         throw new EntityNotFoundException("Payment Not found"+orderId);
     }
}
