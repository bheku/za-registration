package net.iqb.zaregistration.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {

    @Bean
    public DataSource getDataSource(){

        DataSourceBuilder builder = DataSourceBuilder.create();

        builder.driverClassName("org.postgresql.Driver");
        builder.url("jdbc:postgresql://localhost:5432/postgres");
        builder.username("postgres");
        builder.password("Pass1234!");

        return builder.build();

    }

}
