package com.marketplaceprado.courseprojectsales.repositories;

import com.marketplaceprado.courseprojectsales.entities.Category;
import com.marketplaceprado.courseprojectsales.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
