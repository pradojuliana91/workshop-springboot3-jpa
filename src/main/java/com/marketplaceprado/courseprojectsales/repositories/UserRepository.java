package com.marketplaceprado.courseprojectsales.repositories;

import com.marketplaceprado.courseprojectsales.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
