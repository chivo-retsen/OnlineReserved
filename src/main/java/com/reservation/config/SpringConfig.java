package com.reservation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


//удалить класс, разобраться с аннотациями ниже
@Configuration
@ComponentScan(basePackages = {"com.reservation"})
public class SpringConfig {


//    @Bean
//    public DataSource getDataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setUrl("jdbc:mysql://localhost:3306/reserved_tickets"); //dataSource.setUrl("jdbc:mysql://localhost:3306/vebinar?useSll=false");
//        dataSource.setUsername("root");
//        dataSource.setPassword("admin");
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");     //  com.mysql.jdbc.Driver   устарело. "com.mysql.cj.jdbc.Driver"
//        return dataSource;
//    }

}
