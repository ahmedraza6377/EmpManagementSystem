# Employee Management System using Spring Boot

The Employee Management System is a web-based application built with Spring Boot that simplifies the management of employee data within an organization. This system provides HR personnel with the tools to manage employee records and allows employees to access and update their personal information.

## Features

- **Employee Record Management**: Efficiently manage employee data, including personal information, job roles, and salary details.
- **Employee Self-Service**: Allow employees to view and update their own profiles.
- **Reporting**: Generate various reports such as employee attendance and performance.

## Technology Stack

- **Spring Boot**: Framework for building the application.
- **Spring MVC**: Used for handling web requests.
- **Hibernate/JPA**: ORM framework for database operations.
- **MySQL**: Database for storing employee data.

## Project Modules

1. **Employee Management Module**: HR personnel can manage employee records, including personal information, job roles, and salary details.
2. **Employee Self-Service Module**: Employees can view and update their personal information.
3. **Reporting Module**: Generate various reports like attendance and performance.

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- MySQL Database
- Integrated Development Environment (IDE) (e.g., IntelliJ IDEA, Eclipse)

### Installation

1. Clone the repository: `git clone https://github.com/yourusername/employee-management-system.git`
2. Import the project into your IDE.
3. Configure the `application.properties` file with your database settings (see the [sample configuration](#applicationproperties-configuration)).
4. Run the application.

### Application.properties Configuration

Ensure that your `application.properties` file is configured with the following properties (adjust as needed):

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_management_db
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
logging.level.org.springframework.web=DEBUG
logging.level.org.hibernate=ERROR
server.port=8080
spring.datasource.url=jdbc:mysql://localhost:3306/employee_management_db?serverTimezone=UTC
# EmpManagementSystem
