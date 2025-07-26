package com.crio.online_grocery.service;

import java.util.List;
import java.util.stream.Collectors;

//import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.crio.online_grocery.dto.CustomerDTO;
import com.crio.online_grocery.dtoMapper.DTOMapper;
import com.crio.online_grocery.entity.Customer;
import com.crio.online_grocery.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository repo;
    private final DTOMapper mapper;
    
    @Override
    public CustomerDTO createCustomer(CustomerDTO dto) {
        Customer customer = mapper.toCustomerEntity(dto);
        return mapper.toCustomerDTO(repo.save(customer));
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return repo.findAll().stream()
                .map(mapper::toCustomerDTO)
                .collect(Collectors.toList());
    }
    
}
