package com.example.k8s.usersettings.database.dao;

import java.util.List;

import com.example.k8s.usersettings.database.model.DbAccountSettings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUserSettingsDAO extends CrudRepository<DbAccountSettings, String> {

    @Override
    <S extends DbAccountSettings> S save(S entity);

    @Override
    List<DbAccountSettings> findAll();
}

