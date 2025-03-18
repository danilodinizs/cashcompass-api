# Personal Finance Management API

---

An advanced and scalable API for managing personal finances, built with modern technologies and principles. This project is designed to deliver robust performance, maintainable code, and seamless integration with existing systems.

## Features
- **Transaction Management**: Create, update, delete, and retrieve financial transactions with ease.
- **Category Management**: Manage custom categories to organize transactions effectively.
- **Clean Architecture**: Following Clean Architecture principles for better code organization and maintainability.
- **Database Versioning**: Leveraging Flyway for consistent and traceable database migrations.
- **Secure Access**: Implemented with Spring Security and JWT for robust authentication and authorization.
- **Containerization**: Built with Docker for simplified deployment and scalability.
- **Modern Java**: Developed with Java 21, utilizing the latest language features.
- **Unit Testing**: Comprehensive unit tests ensure code reliability and maintainability.

---

## Tech Stack
- **Java 21**: Modern Java features for cleaner and more efficient code.
- **Spring Framework**: Includes Spring Boot for rapid development, Spring Data for database interaction, and Spring Security for robust authentication and authorization.
- **Docker**: Containerized application for easy deployment and scalability.
- **Flyway**: For managing database schema migrations.
- **PostgreSQL**: Reliable and scalable database backend.
- **JUnit & Mockito**: Comprehensive unit testing for code reliability and maintainability.
- **Swagger**: API documentation for easy testing and integration.

---

## Architecture
The project follows the principles of **Clean Architecture**, ensuring:
- **Separation of Concerns**: Dividing the application into clear layers (Domain, Application, Infrastructure, and Presentation).
- **Testability**: High test coverage and easily testable components.
- **Flexibility**: Easy adaptability for new features and integrations.

### Project Structure
```plaintext
src
├── main
│   ├── java
│   │   └── com.example.eventmanagement
│   │       ├── application  # Application logic
│   │       ├── domain       # Core business rules
│   │       ├── infrastructure # External integrations and database
│   │       └── presentation  # Controllers and REST endpoints
│   └── resources
│       ├── db/migration     # Flyway migrations
│       └── application.yml  # Application configuration
└── test
    └── java                 # Unit and integration tests
```

---