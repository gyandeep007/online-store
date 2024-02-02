package com.example.onlinestore.repository;

import com.example.onlinestore.entities.Customer;
import com.example.onlinestore.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
