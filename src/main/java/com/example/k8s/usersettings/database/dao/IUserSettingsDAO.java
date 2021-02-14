package com.example.k8s.usersettings.database.dao;

import java.util.List;

import com.example.k8s.usersettings.database.model.DBAccountOrderSettings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUserSettingsDAO extends CrudRepository<DBAccountOrderSettings, String> {

    @Override
    <S extends DBAccountOrderSettings> S save(S entity);

    @Override
    List<DBAccountOrderSettings> findAll();
}

