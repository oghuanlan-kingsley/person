Person API Documentation
Welcome to the documentation for the Person API. This API allows you to manage person records through CRUD operations. Below, you will find details on how to use the API, including standard request and response formats, sample usage, limitations, and setup instructions.

Standard Request Formats
Create a Person (POST /api/persons)
Request Body Format:
json
Copy code
{
"name": "string (required)"
}
Read a Person (GET /api/{user_id})
Request Path Parameters:
id: The ID of the person to retrieve (integer, required).
Update a Person (PUT /api/{user_id})
Request Path Parameters:
id: The ID of the person to update (integer, required).
Request Body Format:
json
Copy code
{
"name": "string (required)"
}
Delete a Person (DELETE /api/{user_id})
Request Path Parameters:
id: The ID of the person to delete (integer, required).
Get All Persons (GET /api/all)
No additional request parameters required.
Standard Response Formats
Success Response (HTTP 200 OK)
Response Body Format (for GET requests):

json

{
"id": integer,
"name": "string"
}
Response Body Format (for POST, PUT, and DELETE requests):


Create a Person
Request:

http

POST /api
Content-Type: application/json

{
"name": "Mark Essien"
}
Response (HTTP 201 Created):


Get Person by Id
Request:

http
GET /api/{user_id}
Response (HTTP 200 OK):

json

{
"id": 1,
"name": "Mark Essien"
}
Update a Person
Request:

http

PUT /api/{user_id}
Content-Type: application/json

{
"name": "Updated Name"
}
Response (HTTP 200 OK):

json

{
"id": 1,
"name": "Updated Name"
}


Delete a Person
Request:


DELETE /api/{user_id}
Response (HTTP 200 OK):

json

{
"message": "Person deleted successfully"
}
Get All Persons
Request:

GET /api/all
Response (HTTP 200 OK):

json

[
{
"id": 1,
"name": "Mark Essien"
},
{
"id": 2,
"name": "John Doe"
}
]


Known Limitations and Assumptions
This API assumes that person records consist of a name (string).
Validation is in place to ensure that the name contains only alphabetic characters and spaces.
The API assumes a relational database is configured and that the database schema has been created beforehand.
Setting Up and Deploying the API
Clone the repository:


git clone https://github.com/oghuanlan-kingsley/person
cd person-api
Configure the database in src/main/resources/application.properties.

Build and run the application:

mvn clean install
mvn spring-boot:run
The API will be available at http://localhost:8080/api

Feel free to customize this documentation with additional details or specific instructions for your API users.




