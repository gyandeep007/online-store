package com.example.onlinestore.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@Entity
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "CUSTOMER_ID_SEQ")
    @SequenceGenerator(
            name = "CUSTOMER_ID_SEQ",
            sequenceName = "CUSTOMER_ID_SEQ",allocationSize = 1)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;

}
