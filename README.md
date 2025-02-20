## Overview

A RESTful API service built using Spring Boot to manage the exam enrollment process for a Learning Management System (LMS). The application uses MySQL to persist user data.

## Features

- **CRUD Operations**: Perform Create, Read, Update and Delete operations for Students, Subjects and Exams.
- **Enrollment Logic**: Ensure students can only register for exams after enrolling in corresponding subjects.
- **Exception Handling**: Gracefully handle errors and return appropriate HTTP status codes.
- **GlobalExceptionHandler**: Centralized exception handling using @ControllerAdvice for improved code maintainability.

## Getting Started

### Prerequisites

- Java 17 or higher
- MySQL
- Postman for API testing

### Installation

1. **Clone the repository:**

    ```bash
    git clone https://github.com/pgprajwal/Learning-Navigator.git
    ```

2. **Navigate to the project directory:**

    ```bash
    cd Learning-Navigator
    ```
    
### Configuration

1. Open the `application.properties` file located in `src/main/resources` directory.

2. Configure the MySQL database connection settings:

    ```bash
    spring.datasource.url = jdbc:mysql://localhost:3306/learning_navigator
    spring.datasource.username = root
    spring.datasource.password = password
    ```
    
    Replace `localhost`, `3306`, `root`, and `password` with your MySQL host, port, username and password respectively.

3. Save the changes to the `application.properties` file.

### Running the Application

* Run the application using Gradle:

    ```bash
    ./gradlew bootrun
    ```
## API Endpoints

You can find the API endpoints and test them using the provided [Postman Collection](https://www.postman.com/pgprajwal/workspace/api-repository/collection/34348286-a823fdd3-4a7e-440c-b7c6-456ba46f8135?action=share&creator=34348286)
