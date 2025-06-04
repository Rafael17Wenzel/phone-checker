package com.checker.phone_checker.repositories.blacklist;

import com.checker.phone_checker.models.Blacklist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlacklistRepository extends JpaRepository<Blacklist, Long> {
}
