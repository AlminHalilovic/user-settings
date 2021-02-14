package com.example.k8s.usersettings.database;

import java.util.ArrayList;
import java.util.List;

import com.example.k8s.usersettings.database.model.DBAccountOrderSettings;
import com.example.k8s.usersettings.domain.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public List<Account> toAccounts(List<DBAccountOrderSettings> accountOrderSettingsList) {
        List<Account> accounts = new ArrayList<>();
        accountOrderSettingsList.forEach(dbAccountOrderSettings -> {
            Account account = new Account();
            account.setId(dbAccountOrderSettings.getId());
            account.setName(dbAccountOrderSettings.getAccountName());
            account.setOrder(dbAccountOrderSettings.getAccountOrder());

            accounts.add(account);
        });

        return accounts;
    }
}
