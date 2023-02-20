# User Management System
- ## Frameworks and Language used
    - #### Spring Boot Framework
    - #### Java language
- ## Data flow in the project
1. Controller ( getAllUser(), getUserbyId(), addUser(), UpdateUser(), deleteUser()).
2. Services   ( getAll(), getUsingId(), saveUser(), Update(), deleteUser()).
3. Repository ( We extend the JPA repository to get the predefined function).
4. DataBase Design (In this we have Used H2-DB (which is a in memory database)).
- ## Data Structure used
    - #### ArrayList of type String
    - #### HashMap<String,String> for designing ResponseEntity while exception handling
- ## Database Used
    - #### H2 console
- ## Project Summary
  This is a User Management System built with Java Spring Boot, using an H2 database engine and Maven build tool. Swagger is used for API documentation, and validation is implemented to ensure data integrity. The system supports adding, getting, updating, and deleting users. The project follows the Model-View-Controller (MVC) architecture pattern, with separate layers for controller, service, and repository.

  > http://localhost:8080/api/

  End points:
    - ##### /getAllUser
    - ##### /getUser/{userId}
    - ##### /addUser
    - ##### /updateUserInfo/userId/{userId}
    - ##### /deleteUser
