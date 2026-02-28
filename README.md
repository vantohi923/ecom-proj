# E-Commerce Product Management API

This project is a RESTful API built using Spring Boot for managing products in an e-commerce system.  
It supports CRUD operations, image upload and retrieval, and uses an in-memory H2 database.

## Overview

The application allows clients to:

- create products with image upload
- retrieve products
- update existing products
- delete products
- fetch stored product images

The project was developed to practice building REST APIs, handling file uploads, and working with relational databases using Spring Boot.

## Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate ORM
- H2 in-memory database
- Maven
- Postman (API testing)

## Database Configuration

The application uses an in-memory H2 database.

H2 Console:
http://localhost:8080/h2-console

JDBC URL:
jdbc:h2:mem:testdb

Username:
sa

Password:
(blank)

## Running the Application

1. Clone the repository

   git clone https://github.com/your-username/ecom-proj.git

2. Open the project in an IDE (IntelliJ IDEA or Eclipse)

3. Run the main class:

   EcomProjApplication.java

4. The server will start on:

   http://localhost:8080

## API Endpoints

### Get all products
GET /api/products

### Get product by ID
GET /api/product/{id}

### Add product with image
POST /api/product

Request type: multipart/form-data

Parts:
- product (JSON)
- imageFile (file)

Example JSON:

{
  "name": "Phone",
  "desc": "Smartphone",
  "brand": "Samsung",
  "price": 20000,
  "category": "Electronics",
  "releaseDate": "2024-01-01",
  "available": true,
  "quantity": 10
}

### Retrieve product image
GET /api/product/{id}/image

### Update product
PUT /api/product/{id}

Request type: multipart/form-data

Parts:
- product (JSON)
- imageFile (file)

### Delete product
DELETE /api/product/{id}

## Testing

All endpoints were tested using Postman.

## Learning Outcomes

Through this project, I practiced:

- designing REST APIs using Spring Boot
- implementing CRUD operations
- handling multipart file uploads
- storing and retrieving images from a database
- using Spring Data JPA for persistence
- working with an H2 in-memory database
- testing endpoints using Postman
## Acknowledgment

This project was developed while following educational tutorials and was extended and customized for learning purposes.

## Author

Antohi Gelu Valentin
