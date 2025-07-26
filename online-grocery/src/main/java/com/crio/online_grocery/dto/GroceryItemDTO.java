package com.crio.online_grocery.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroceryItemDTO {
    private Long id;
    private String name;
    private String category;
    private double price;
    private String phone;
}
