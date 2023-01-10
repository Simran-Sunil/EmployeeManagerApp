package com.example.employeemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@SpringBootApplication
public class EmployeemanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagerApplication.class, args);
	}
	
	@Bean
	public CorsFilter corsFilter() {
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
				"Accept", "Authorization", "Origin, Accept", "X-Requested-With",
				"Access-Control-Request-Method", "Access-Control-Request-Headers"));
		corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
				"Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(urlBasedCorsConfigurationSource);
	}

}

/*
{
    "email": "daniel@gmail.com",
    "imageUrl": "https://www.bootdey.com/img/Content/avatar/avatar1.png",
    "jobTitle": "JavaScript",
    "name": "Daniel Craig",
    "phone": "4739846579"
}
{
    "email": "john@gmail.com",
    "imageUrl": "https://www.bootdey.com/img/Content/avatar/avatar2.png",
    "jobTitle": "Java",
    "name": "John Smith",
    "phone": "7589478349"
}
{
    "email": "christine@gmail.com",
    "imageUrl": "https://www.bootdey.com/img/Content/avatar/avatar3.png",
    "jobTitle": "UI/UX",
    "name": "Christine James",
    "phone": "9846751294"
}
{
    "email": "Dave@gmail.com",
    "imageUrl": "https://www.bootdey.com/img/Content/avatar/avatar6.png",
    "jobTitle": "Java",
    "name": "Dave Rogers",
    "phone": "7839017843"
}
{
    "email": "andrew@gmail.com",
    "imageUrl": "https://www.bootdey.com/img/Content/avatar/avatar7.png",
    "jobTitle": "Python",
    "name": "Andrew Ng",
    "phone": "9647283617"
}
*/