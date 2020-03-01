package com.javatechnology;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

@SpringBootApplication
//@PropertySource("spring.properties")
public class Application {
		
	public static void main(String[] args) {
		SpringApplication app=new SpringApplication(Application.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
		//PropertySourcesPlaceholderConfigurer
	}
	@Bean
	public PropertySourcesPlaceholderConfigurer configure() {
		PropertySourcesPlaceholderConfigurer property=new PropertySourcesPlaceholderConfigurer();
		Resource resource=new ClassPathResource("spring.properties");
		//Resource resource1=new FileSystemResource(file)
		property.setLocation(resource);
		return property;
	}
}
