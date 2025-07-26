package com.crio.online_grocery.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private Long id;
    private Long customerId;
    private List<Long> groceryItemIds;
    private LocalDate orderDate;
    private double totalPrice;
}
