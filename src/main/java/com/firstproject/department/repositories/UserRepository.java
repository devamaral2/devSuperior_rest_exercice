package com.firstproject.department.repositories;

import com.firstproject.department.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
