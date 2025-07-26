package com.crio.online_grocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crio.online_grocery.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
