package com.checker.phone_checker.controllers.pixChecker;

import org.springframework.web.bind.annotation.RestController;

import com.checker.phone_checker.models.bodyRequests.PixCheckerBodyRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class PixChecker {

    @GetMapping("/checar/{userId}")
    public String pixChecker(
        @PathVariable("userId") Long id,
        @RequestBody PixCheckerBodyRequest body
    ) {
        // Blacklist



        return "Deu certo - Usuario: " + id + " --- " + body.getPixCode();
    }
    
}
