package com.github.shaai22.webcrud.repository;

import com.github.shaai22.webcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
