Person API
This is a Java Spring Boot API for managing person records. You can perform CRUD operations on person records, including creating, reading, updating, and deleting persons.



Prerequisites
Before you begin, ensure you have met the following requirements:

-Java Development Kit (JDK)

-Spring Boot

-Maven

-Database (e.g., H2, MySQL(used), PostgreSQL) and its configuration details (URL, username, password)
Postman or a similar tool for testing the API

Setup  
Clone the repository:
git clone https://github.com/your-username/person-api.git
cd person-api

Configure the database in "src/main/resources/application.properties" :

spring.datasource.url=jdbc:mysql://localhost/person  
spring.datasource.username=root   
spring.datasource.password=password

Replace the database URL, username, and password with your database configuration.

Build and run the application:

mvn clean install         
mvn spring-boot:run           
The API will be available at http://localhost:8080/api

Usage       
You can interact with the API using HTTP requests. Here are the available endpoints:

Create a Person
Endpoint: POST /api

Request Body:

json
{
"name": "Mark Essien"
}     
Response: Returns the created person with an assigned ID.

Get a Person
Endpoint: GET /api/{user_id}

Response: Returns the details of the person with the specified ID.

Update a Person
Endpoint: PUT /api/{user_id}

Request Body:

json
{
"name": "Updated Name"
}
Response: Returns the updated person details.

Delete a Person
Endpoint: DELETE /api/{user_id}

Response: Returns no content upon successful deletion.

Get All Persons
Endpoint: GET /api/all

Response: Returns a list of all persons in the database.

Contributing
Contributions are welcome! Please feel free to submit issues or pull requests.