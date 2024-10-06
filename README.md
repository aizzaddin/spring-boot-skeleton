# Spring Boot Skeleton with Spring Security, JWT, and Swagger

This project is a Spring Boot skeleton designed to provide a fast and efficient way to kickstart a new Spring Boot project. It includes pre-configured Spring Security with JWT authentication and Swagger for API documentation. This template aims to simplify the initial setup process, allowing you to focus on building your application's core features.

## Features

- **Spring Boot** : A fast and efficient way to create Java-based microservices and web applications.
- **Spring Security** : Provides authentication and authorization using JWT (JSON Web Tokens).
- **JWT (JSON Web Token)** : Secure token-based authentication for stateless communication between client and server.
- **Swagger** : Automatically generated API documentation with an intuitive UI.

## Prerequisites

Before you can run this project, you will need to have the following installed:

- Java 21 or higher
- An IDE (such as IntelliJ IDEA or Eclipse)

## Getting Started

### Clone the repository
```bash
git clone https://github.com/aizzaddin/spring-boot-skeleton.git
```

### Configuration
- **Application Properties** : Modify the `application.properties` file in src/main/resources/ to set up your database, JWT secret, and other configurations.
- **JWT Settings** : The secret key, expiration time, and other JWT configurations are located in the application.properties file.
```properties
spring.application.name=[your-app-name]
springdoc.api-docs.path=/api-docs

spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.url=[your-database-url]
spring.datasource.username=[your-database-username]
spring.datasource.password=[your-database-password]

secret.key=[your-secret-key]
```

### Endpoint
The skeleton provides the following endpoints out of the box:
**Authentication** :
- POST /api/v1/auth/login: Authenticates the user and returns a JWT token.
- POST /api/v1/auth/register: Registers a new user.

### Security

This project uses Spring Security to enforce role-based access control. The JWT token is required for accessing protected endpoints, and it must be included in the Authorization header as a Bearer token:
```
Authorization: Bearer <token>
```

### Swagger
Swagger is integrated to provide interactive API documentation. You can access the Swagger UI at: `https://localhost:8080/swagger-ui/index.html`

Use the JWT token obtained from the /login endpoint to authenticate via the Swagger UI by clicking on the Authorize button.

### Project Structure
```
src/
 ├── main/
 │    ├── java/com/yourpackage
 │    │    ├── config/          # Configuration classes (Security, JWT, Swagger)
 │    │    ├── controller/      # REST API controllers
 │    │    ├── dto/             # DTO's
 │    │    ├── model/           # Entity and model classes
 │    │    ├── repository/      # Repository interfaces (data access layer)
 │    │    └── service/         # Service Interface layer
 |    |        └── impl/        # Service Implementation layer
 │    └── resources/
 │         └── application.properties  # Main configuration file
 └── test/                             # Unit and integration tests [If Needed]
```

## Contributing

If you’d like to contribute to this project, feel free to open an issue or submit a pull request.

