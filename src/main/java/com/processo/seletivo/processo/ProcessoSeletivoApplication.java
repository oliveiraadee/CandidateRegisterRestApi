package com.processo.seletivo.processo;

import com.processo.seletivo.processo.service.UserCandidateService;
import com.processo.seletivo.processo.webservice.UserCandidateWebService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@ComponentScan(basePackageClasses = {UserCandidateWebService.class, UserCandidateService.class})
@EnableJpaRepositories(basePackages="com.processo.seletivo.processo.repository")
@EntityScan("com.processo.seletivo.processo.entity")
public class ProcessoSeletivoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessoSeletivoApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/users").allowedOrigins("http://localhost:8080");
			}
		};
	}
}
