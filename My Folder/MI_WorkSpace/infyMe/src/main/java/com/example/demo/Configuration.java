package com.example.demo;

i

import javax.activation.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Configuration {
   @Bean
   public DataSource dataSource(){
      DriverManagerDataSource dataSource = new DriverManagerDataSource();
      dataSource.setDriverClassName("com.mysql.jdbc.Driver");
      dataSource.setUrl("jdbc:mysql://localhost:3306/infyme");
      dataSource.setUsername( "User1" );
      dataSource.setPassword( "User1pwd#1" );
      return dataSource;
   }
}