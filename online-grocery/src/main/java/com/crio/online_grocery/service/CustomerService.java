package com.crio.online_grocery.service;

import java.util.List;

import com.crio.online_grocery.dto.CustomerDTO;

public interface CustomerService {
    CustomerDTO createCustomer(CustomerDTO dto);
    List<CustomerDTO> getAllCustomers();
}
