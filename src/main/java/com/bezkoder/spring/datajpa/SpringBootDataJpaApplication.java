package com.bezkoder.spring.datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;  
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;

//@ComponentScan({"com.bezkoder.spring.datajpa"})
@EnableDiscoveryClient  
@EntityScan("com.bezkoder.spring.datajpa.model")
@EnableJpaRepositories("com.bezkoder.spring.datajpa.repository")
@SpringBootApplication()
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringBootDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaApplication.class, args);
	}

}
