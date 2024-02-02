package com.example.onlinestore.repository;

import com.example.onlinestore.entities.Order;
import com.example.onlinestore.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
