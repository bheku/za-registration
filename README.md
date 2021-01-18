# za-registration
Basic Spring Boot back end that communicates with a Postgres database.

### Expected database setup
Built and run against a Docker instance of Postgres. As such the most basic of set ups was followed:

1. Get the latest Docker image 
```
docker pull postgres
```
2. Create a directory where database changes can be persisted. Ensure that read and write access are available to that directory, then run the image as shown below.
```
docker run 
-d --name reg-postgres 
-e POSTGRES_PASSWORD=Pass1234! 
-v [specify the path to the directory you created for Postgres]:/var/lib/postgresql/data 
-p 5432:5432 postgres
```
The Spring Boot app is expecting to connect to the database using the password above, so you can just copy the above line and run as is.

Once the image is running, the Spring Boot application can be run.



### Available End Points
You can POST to the Spring Boot app using the following end point:
```
http://localhost:8080/registration/add
```
with the expected JSON payload below:
```
{
    "name":"yauFyha Uyauuatah",
    "nationalID":"0865446665",
    "phoneNumber":"235445677"
}
```

You can use the following end point to GET a list of people that have been persisted via the previous POST method:
```
http://localhost:8080/registration/report
```
