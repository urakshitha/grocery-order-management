package com.crio.online_grocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crio.online_grocery.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
