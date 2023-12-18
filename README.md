Project Name: Spring Boot CRUD API

Introduction:
This project is a simple CRUD API built using the Spring Boot framework. The API allows for the manipulation of entities through standard HTTP methods (GET, POST, PUT, DELETE). 
It is designed to serve as a foundation for building more complex applications that require persistent data storage.

Prerequisites:
Before you begin, ensure you have the following installed:

Java 8 or later
Maven
IDE (Spring Tool Suit)

Endpoints:
The API provides the following endpoints:

GET /api/courses: Retrieve all entities.
GET /api/v1/e/{courseId}: Retrieve a specific entity by ID.
POST /api/addcourse: Create a new entity.
PUT /api/updatecourses: Update an existing entity.
DELETE /api/deletecourse/{courseId}: Delete an entity by ID.

By default, the application will run on http://localhost:9090.

