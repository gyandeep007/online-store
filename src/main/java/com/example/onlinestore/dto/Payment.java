package com.example.onlinestore.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class Payment {
    private Long id;
    private Long orderId;
    private Date paymentDate;
    private double amount;
}
