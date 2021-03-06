package com.example.k8s.usersettings.database;

import java.util.List;
import java.util.Optional;

import com.example.k8s.usersettings.database.dao.IUserSettingsDAO;
import com.example.k8s.usersettings.database.model.DbAccountSettings;
import com.example.k8s.usersettings.domain.Account;
import com.example.k8s.usersettings.domain.AccountUpdate;
import com.example.k8s.usersettings.exception.AccountNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSettingsDatabaseService {

    @Autowired
    private IUserSettingsDAO userSettingsDAO;

    @Autowired
    private com.example.k8s.usersettings.database.AccountMapper accountMapper;

    public List<Account> getAccounts() {
        List<DbAccountSettings> dbAccountSettingsList = userSettingsDAO.findAll();
        return accountMapper.toAccounts(dbAccountSettingsList);
    }

    public void patchAccountSettings(String accountId, AccountUpdate accountUpdate) {

        Optional<DbAccountSettings> dbAccountOrderSettingsOptional = userSettingsDAO.findById(accountId);

        if (dbAccountOrderSettingsOptional.isPresent()) {

            DbAccountSettings dbAccountSettings = dbAccountOrderSettingsOptional.get();

            if (accountUpdate.getNewName() != null) {
                dbAccountSettings.setAccountName(accountUpdate.getNewName());
            }

            if (accountUpdate.getNewOrder() != null) {
                dbAccountSettings.setAccountOrder(accountUpdate.getNewOrder());
            }

            userSettingsDAO.save(dbAccountOrderSettingsOptional.get());
        } else {
            throw new AccountNotFoundException();
        }
    }

}
