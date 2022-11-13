# Hackhaton backend REST API #

This api contains backend for improving analytics to the data science team.

The technologies used are:
MySql, Java, Spring Boot.


### Importing database ###
    mysql -u username -p j2d_backend < j2d_database.sql
### Create an env.properties file into the root folder ###
    DB_DATABASE=jdbc:mysql://localhost:3306/j2d_backend
    DB_USER=*youruser*
    DB_PASSWORD=*yourpassword*
### Endpoint structure ###
- /founded --> get a list of the companies ordered by year of foundation
- /size --> get a list of the companies ordered by size
- /count
  - /industry --> get the count of the companies for each industry type
  - /size --> get the count of the companies for each size
  - /founded --> get the count of the companies for each foundation year