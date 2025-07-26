package com.crio.online_grocery.dtoMapper;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.crio.online_grocery.dto.CustomerDTO;
import com.crio.online_grocery.dto.GroceryItemDTO;
import com.crio.online_grocery.dto.OrderDTO;
import com.crio.online_grocery.entity.Customer;
import com.crio.online_grocery.entity.GroceryItem;
import com.crio.online_grocery.entity.Order;

@Component
@RequiredArgsConstructor
public class DTOMapper {
    private final ModelMapper modelMapper;

    public CustomerDTO toCustomerDTO(Customer customer) {
        return modelMapper.map(customer, CustomerDTO.class);
    }

    public Customer toCustomerEntity(CustomerDTO dto) {
        return modelMapper.map(dto, Customer.class);
    }

    public GroceryItemDTO toGroceryItemDTO(GroceryItem groceryItem) {
        return modelMapper.map(groceryItem, GroceryItemDTO.class);
    }

    public GroceryItem toGroceryItemEntity(GroceryItemDTO dto) {
        return modelMapper.map(dto, GroceryItem.class);
    }

    public OrderDTO toOrderDTO(Order order) {
        return modelMapper.map(order, OrderDTO.class);
    }

    public Order toorderEntity(OrderDTO dto) {
        return modelMapper.map(dto, Order.class);
    }
}
