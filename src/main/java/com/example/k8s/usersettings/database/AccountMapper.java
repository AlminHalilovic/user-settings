package com.example.k8s.usersettings.database;

import java.util.ArrayList;
import java.util.List;

import com.example.k8s.usersettings.database.model.DbAccountSettings;
import com.example.k8s.usersettings.domain.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public List<Account> toAccounts(List<DbAccountSettings> accountOrderSettingsList) {
        List<Account> accounts = new ArrayList<>();
        accountOrderSettingsList.forEach(dbAccountSettings -> {
            Account account = new Account();
            account.setId(dbAccountSettings.getId());
            account.setName(dbAccountSettings.getAccountName());
            account.setOrder(dbAccountSettings.getAccountOrder());

            accounts.add(account);
        });

        return accounts;
    }
}
