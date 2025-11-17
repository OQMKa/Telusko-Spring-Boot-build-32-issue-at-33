package com.security32.practise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.security32.practise.*")
@EnableJpaRepositories(basePackages = "com.security32.practise.*")
@ComponentScan(basePackages = "com.security32.practise.*")
public class SpringSecurityBuild32Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityBuild32Application.class, args);
	}

}
