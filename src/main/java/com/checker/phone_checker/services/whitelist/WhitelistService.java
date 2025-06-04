package com.checker.phone_checker.services.whitelist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.checker.phone_checker.repositories.whitelist.WhitelistRepository;

@Service
public class WhitelistService {

    @Autowired
    private WhitelistRepository whitelistRepository;

    public void removeUser(Long id) {
        if(whitelistRepository.existsByUser_Id(id)) {
            whitelistRepository.deleteALLByUser_id(id);
        }
    }
    
}
