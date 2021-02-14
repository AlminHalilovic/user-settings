package com.example.k8s.usersettings.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Database connection manager
 */
@Configuration
@EnableJpaRepositories(basePackages = { "com.example.k8s.usersettings.database" })
@EntityScan(basePackages = { "com.example.k8s.usersettings.database" })
public class DatabaseConfig {
}