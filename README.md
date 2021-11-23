# Todo - API

##### The api can create and store record  in memory db ,in this case  I use h2
##### You can get all records that were created before stop the project
##### Once you stop the record will  be lost
##### You can update I used PUT method  sure the make I replace the  record on the db
##### You can delete record by pass id

## To run the project on you local machine
##### can use `mvn spring-boot:run` on  local machine 

## To run the project using docker image
##### can use `mvn clean install` on  local machine  to build image then run using `docker run -it -p 8080:8080 todo/simple-todo-api-problem:0.0.1-SNAPSHOT`
##### can also do docker images verify your image

## To access project using swagger ui
#####  use http://localhost:8080/swagger-ui.html

## For test cases
##### you  can run `mvn clean test  ` on terminal or use unit test on your ide

