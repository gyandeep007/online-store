package com.example.onlinestore.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@Entity
@Table(name = "order_tab")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "order_gen")
    @SequenceGenerator(
            name = "order_gen",
            sequenceName = "ORDER_ID_SEQ",allocationSize = 1)
    private Long id;


    @ManyToOne
    @JoinColumn
    private Customer customer;

    private java.sql.Date orderDate;

    private double totalAmount;
    @OneToMany
    @JoinColumn(name = "order_id")
    private List<OrderItem> orderItemList;
}
