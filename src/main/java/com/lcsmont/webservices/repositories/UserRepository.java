package com.lcsmont.webservices.repositories;

import com.lcsmont.webservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
