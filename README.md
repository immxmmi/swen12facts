# 12-Factor
This project uses Quarkus, the Supersonic Subatomic Java Framework.
>@Mahmoud Ismail se23m051
## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Endpoints
- GET `/books`: Lists all books.
- POST `/books`: Adds a new book.
- GET `/books/{id}`: Retrieves details of a specific book.
- PUT `/books/{id}`: Updates an existing book.
- DELETE `/books/{id}`: Deletes a book.


## Implementation

In this project, the 12-Factor Methodology has been implemented as follows:

### 1. Codebase
- Implemented: A single code repository with version control (Git).

### 2. Dependencies
- Implemented: All dependencies are explicitly declared with Maven.

### 3. Configuration
- Implemented: Configurations are stored in `application.properties` and controlled through environment variables.

### 4. Backing Services
- Implemented: The database (PostgreSQL) is treated as a separate service.

### 5. Build, Release, Run
- Implemented: Clear separation of build, release, and run phases through Maven and Docker.

### 6. Processes
- Implemented: The application runs as a stateless process.

### 7. Port Binding
- Implemented: Services are accessible via port binding.

### 8. Concurrency
- Implemented: Supports scalability and concurrency.

### 9. Disposability
- Implemented: Fast startup and graceful shutdown are supported by Quarkus.

### 10. Logs
- Implemented: Logs are displayed in the console and can be integrated into a log management system.
