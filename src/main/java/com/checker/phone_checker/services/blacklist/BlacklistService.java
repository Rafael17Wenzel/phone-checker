package com.checker.phone_checker.services.blacklist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.checker.phone_checker.models.Blacklist;
import com.checker.phone_checker.models.User;
import com.checker.phone_checker.repositories.blacklist.BlacklistRepository;

@Service
public class BlacklistService {
    
    @Autowired
    private BlacklistRepository blacklistRepository;

    public Blacklist addUserToBlacklist(User User) {
        Blacklist blacklist = new Blacklist();
        blacklist.setUser(User);
        blacklistRepository.save(blacklist);

        return blacklist;
    }

}
