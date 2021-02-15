package com.example.k8s.usersettings.controller;

import java.util.List;

import com.example.k8s.usersettings.domain.Account;
import com.example.k8s.usersettings.domain.AccountUpdate;
import com.example.k8s.usersettings.service.UserSettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserSettingsController {

    @Autowired
    private UserSettingsService userSettingsService;

    @GetMapping("/settings/account-settings")
    public ResponseEntity<List<Account>> getAccounts() {

        return ResponseEntity.ok(userSettingsService.getAccounts());
    }


    @PatchMapping("/settings/{accountId}/account-settings")
    public ResponseEntity<Void> patchAccountSettings(@PathVariable("accountId") String accountId,
                                                     @RequestBody AccountUpdate accountUpdate) {
        userSettingsService.patchAccountSettings(accountId, accountUpdate);

        return ResponseEntity.accepted().build();
    }
}