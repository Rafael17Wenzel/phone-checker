package com.checker.phone_checker.repositories.user;

import com.checker.phone_checker.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
