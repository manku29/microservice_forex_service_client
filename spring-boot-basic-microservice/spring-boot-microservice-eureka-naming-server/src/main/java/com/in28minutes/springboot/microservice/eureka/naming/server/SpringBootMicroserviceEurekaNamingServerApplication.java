package com.in28minutes.springboot.microservice.eureka.naming.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


//https://spring.io/blog/2015/01/20/microservice-registration-and-discovery-with-spring-cloud-and-netflix-s-eureka

//https://www.tutorialspoint.com/spring_boot/spring_boot_eureka_server.htm
//http://www.springboottutorial.com/creating-microservices-with-spring-boot-part-1-getting-started
@SpringBootApplication
@EnableEurekaServer
public class SpringBootMicroserviceEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceEurekaNamingServerApplication.class, args);
	}
}
