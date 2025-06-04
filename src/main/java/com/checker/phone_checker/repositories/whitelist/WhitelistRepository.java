package com.checker.phone_checker.repositories.whitelist;

import com.checker.phone_checker.models.Whitelist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WhitelistRepository extends JpaRepository<Whitelist, Long> {
    boolean existsByUser_Id(Long userId);
    void deleteALLByUser_id(Long userId);
}
