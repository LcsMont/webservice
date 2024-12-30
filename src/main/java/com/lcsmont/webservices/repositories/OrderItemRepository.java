package com.lcsmont.webservices.repositories;

import com.lcsmont.webservices.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
