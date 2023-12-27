package com.marketplaceprado.courseprojectsales.repositories;

import com.marketplaceprado.courseprojectsales.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
