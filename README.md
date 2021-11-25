# Todo - API

##### The api can create and store record  in memory db ,in this case  I use h2
##### You can get all records that were created before stop the project
##### Once you stop the record will  be lost
##### You can update I used PUT method  sure the make I replace the  record on the db
##### You can delete record by pass id

## To run the project on you local machine
##### can use `mvn spring-boot:run` on  local machine 

## To run the project using docker image
##### can use `mvn clean install` on  local machine  to build image then run using `docker run -it -p 8080:8080 todo/app:1.0.0`
##### can also do docker images verify your image

## To access project using swagger ui
#####  use http://localhost:8080/swagger-ui.html

## For test cases
##### you  can run `mvn clean test  ` on terminal or use unit test on your ide

## Test get all

##url http://localhost:8080/todos

###Response

	 {
	    "todos": [
	        {
	            "id": "abc123",
	            "name": "Do some work",
	            "completed": true
	        }
	    ]
	}

## Test Post

##url http://localhost:8080/todos

### request
	
	{
	    "id": "abc123",
	    "name": "Do  work",
	    "completed": true
	}

###Response

	 {
	    "todos": [
	        {
	            "id": "abc123",
	            "name": "Do some work",
	            "completed": true
	        }
	    ]
	}
	
## Test Put

##url http://localhost:8080/todos/abc123

### request
	
	{
	    "id": "abc123",
	    "name": "Do  work",
	    "completed": true
	}

###Response

	{
	    "id": "abc123",
	    "name": "Do  work",
	    "completed": true
	}
	
	
## Test Delete

##url http://localhost:8080/todos/abc123


###Response

	Ok
