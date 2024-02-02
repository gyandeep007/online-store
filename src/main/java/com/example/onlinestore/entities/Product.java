package com.example.onlinestore.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "PRODUCT_ID_SEQ")
    @SequenceGenerator(
            name = "PRODUCT_ID_SEQ",
            sequenceName = "PRODUCT_ID_SEQ",allocationSize = 1)
    private Long id;
    private String name;
    private String description;
    private double price;
    private int stockQuantity;
}
