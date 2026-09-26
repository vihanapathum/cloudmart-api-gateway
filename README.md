# CloudMart — API Gateway

## Project Description

Spring Cloud Gateway acting as the single public entry point for the CloudMart backend. It discovers Product Service, Order Service and User
Service through Eureka and routes requests to them by path, load-balancing
across every healthy instance of each service. CORS is centralized here so
the frontend (deployed separately on Cloud Run) can call the backend from a
different origin.

| Path               | Routed to         |
| ------------------ | ----------------- |
| `/api/products/**` | `product-service` |
| `/api/orders/**`   | `order-service`   |
| `/api/users/**`    | `user-service`    |

## Technology Stack

- Java 25
- Spring Boot 4.0.7
- Spring Cloud Gateway, Eureka Client, Config Client (Spring Cloud 2025.1)
- PM2 (process management on the deployed VM)

## Setup / Getting Started

### Prerequisites

- Java 25 JDK, Maven 3.9+
- Service Registry and Config Server running (for full functionality)

### Run locally

```bash
mvn clean package
java -jar target/api-gateway.jar
```

Then, once the backend services are also running and registered with
Eureka: `curl http://localhost:8080/api/products`

## Student Information

- **Student Name:** A.G.Vihana Pathum Piyasiri
- **Student Number:** 2301692038
- **Slack Handle:** vihana_piyasiri
- **GCP Project ID:** project-1023ef7b-f75c-4e17-ab5
