package com.example.k8s.usersettings.service;

import java.util.List;

import com.example.k8s.usersettings.database.UserSettingsDatabaseService;
import com.example.k8s.usersettings.domain.Account;
import com.example.k8s.usersettings.domain.AccountUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSettingsService {

    @Autowired
    private UserSettingsDatabaseService userSettingsDatabaseService;

    public List<Account> getAccounts() {
        return userSettingsDatabaseService.getAccounts();
    }

    public void patchAccountSettings(String accountId, AccountUpdate accountUpdate) {
        userSettingsDatabaseService.patchAccountSettings(accountId, accountUpdate);
    }
}
