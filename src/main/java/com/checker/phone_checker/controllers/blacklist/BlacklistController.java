package com.checker.phone_checker.controllers.blacklist;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.checker.phone_checker.models.Blacklist;
import com.checker.phone_checker.models.User;
import com.checker.phone_checker.models.UserReview;
import com.checker.phone_checker.services.blacklist.BlacklistService;
import com.checker.phone_checker.services.user.UserService;
import com.checker.phone_checker.services.whitelist.WhitelistService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/blacklist")
public class BlacklistController {

    @Autowired
    private BlacklistService blacklistService;

    @Autowired
    private WhitelistService whitelistService;

    @Autowired
    private UserService userService;

    @PutMapping("/{id}")
    public String postUserToBlacklist(@PathVariable("id") Long id) {
        // Verificar se o Usuário existe
        Optional<User> optionalUser = userService.verifyIfUserExists(id);
        if (!optionalUser.isPresent()) {
           return "Usuário não existe!";
        }

        User user = optionalUser.get();

        // Verificar se o Usuário está na Whitelist (se ele estiver então deve ser removido)
        whitelistService.removeUser(user.getId());


        // Verificar se o Usuário foi revisado
        return "Tudo certo!";

        // return "Houve algum erro interno. Usuário não cadastrado";
    }
    
}
