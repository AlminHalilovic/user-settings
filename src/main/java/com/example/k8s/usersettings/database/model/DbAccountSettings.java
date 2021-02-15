package com.example.k8s.usersettings.database.model;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "ACCOUNT_SETTINGS", schema = "user_settings")
public class DbAccountSettings {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String id;


    @Column(name = "ACCOUNT_NAME", nullable = false)
    private String accountName;

    @Column(name = "ACCOUNT_ORDER", nullable = false)
    private Integer accountOrder;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Integer getAccountOrder() {
        return accountOrder;
    }

    public void setAccountOrder(Integer accountOrder) {
        this.accountOrder = accountOrder;
    }
}