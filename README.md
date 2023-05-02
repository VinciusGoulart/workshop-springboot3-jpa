# Workshop Spring Boot 3 + JPA
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/VinciusGoulart/workshop-springboot3-jpa/blob/main/LICENSE)

This is a project developed during a Spring Boot 3 and JPA workshop. The aim is to provide a basic project structure for those learning these technologies.

## Prerequisites
Before running the project, you must have the following installed on your machine:

- Java 11 or higher
- Maven 3 or higher
- MySQL database

## Database Configuration
The application.properties file contains the database configuration. You need to configure the spring.datasource.url, spring.datasource.username, and spring.datasource.password properties according to your MySQL database configuration.

## Running the Project
To run the project, run the following command in the project root directory:

```bash
# clone repository
git clone https://github.com/VinciusGoulart/workshop-springboot3-jpa.git

# Run project
./mvn spring-boot:run
```

## Usage

The project is a REST API that provides CRUD operations for an entity called Product. The following operations are available:

GET /products: Returns all registered products.
GET /products/{id}: Returns the product with the specified ID.
POST /products: Registers a new product.
PUT /products/{id}: Updates the product with the specified ID.
DELETE /products/{id}: Deletes the product with the specified ID.
Contribution
This project was developed only as an example for learning purposes. Contributions are welcome, but are not guaranteed to be accepted. To contribute, open an issue or a pull request.
