package com.marketplaceprado.courseprojectsales.repositories;

import com.marketplaceprado.courseprojectsales.entities.OrderItem;
import com.marketplaceprado.courseprojectsales.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
