package com.crio.online_grocery.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crio.online_grocery.dto.CustomerDTO;
import com.crio.online_grocery.service.CustomerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService service;

    
    @PostMapping
    public ResponseEntity<CustomerDTO> create(@RequestBody CustomerDTO dto) {
        return ResponseEntity.ok(service.createCustomer(dto));
    }
    
    @GetMapping
    public List<CustomerDTO> getAll() {
        return service.getAllCustomers();
    }

    /* For test of controller setup
    //use curl -X GET http://localhost:8080/api/customers/ping
    @GetMapping("/ping")
    public String ping() {
        return "CustomerController is working!";
    }
    */
}
