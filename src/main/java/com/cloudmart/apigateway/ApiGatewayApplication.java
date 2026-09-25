package com.cloudmart.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * CloudMart - API Gateway.
 * Single entry point for all backend services. Routes are defined in
 * application.yml and use Eureka-based client-side load balancing
 * (lb://product-service, lb://order-service, lb://user-service) so traffic
 * is spread automatically across however many instances of each service
 * the Managed Instance Group is currently running.
 */
@SpringBootApplication
public class ApiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }
}
