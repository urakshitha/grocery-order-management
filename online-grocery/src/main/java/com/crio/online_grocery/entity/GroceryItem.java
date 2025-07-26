package com.crio.online_grocery.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class GroceryItem {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String category;
    private double price;
    private String phone;

    @ManyToMany(mappedBy = "items")
    private List<Order> orders;
}
