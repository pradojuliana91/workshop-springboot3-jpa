package com.marketplaceprado.courseprojectsales.repositories;

import com.marketplaceprado.courseprojectsales.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
