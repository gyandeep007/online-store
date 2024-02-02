package com.example.onlinestore.entities;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "order_item_gen")
    @SequenceGenerator(
            name = "order_item_gen",
            sequenceName = "ORDER_ITEM_SEQ",allocationSize = 1)
    private Long id;
//    @JsonIgnore
//    @ManyToOne
//    @JoinColumn(name = "order_id",referencedColumnName = "id")
//    private Order order;
//    @JsonIgnore
//    @ManyToOne
    @JoinColumn(name = "order_id",referencedColumnName = "id")
    @Column(name = "order_id")
    private Long orderId;
    @OneToOne
    @JsonIncludeProperties(value = {"id","name"})
    private Product product;
    private int quantity;
    private double unitPrice;


}
