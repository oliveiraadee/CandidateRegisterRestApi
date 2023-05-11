# Candidate Register Rest Api
## Libs and Framework

- Spring Framework
- Lombok
- JPA
- MySQL Connector Java
## Installation

### 1. Requiriments
 
 - [Maven](https://maven.apache.org/install.html) 
 - [JDK 16](https://www.oracle.com/br/java/technologies/javase/jdk16-archive-downloads.html)

### 2. Building

2.1. To build the project run this command inside the project folder. This command will build the Java executable.

`mvn compile` 

Inside the project folder yet! To download and install all maven dependencies, run this command  bellow

`mvn install`

### 3. Running

To run after build, type this command in the terminal inside the project folder.

`mvn spring-boot:run`

or

`java -jar target/processo-seletivo-0.0.1-SNAPSHOT.jar`

### 4. Endpoints

#### GET 

`http://localhost:8080/users`

#### GET BY ID

`http://localhost:8080/users/{id}`

#### DELETE BY ID

`http://localhost:8080/users/{id}`

#### PUT BY ID

`http://localhost:8080/users/{id}`


## License
[MIT](https://choosealicense.com/licenses/mit/)

