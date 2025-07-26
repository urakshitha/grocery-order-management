package com.crio.online_grocery.entity;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String address;
    private String phone;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;
}
