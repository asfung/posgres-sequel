# Postgres-Sequel Spring 

### Table Requirement
- id 
- name

### Application.properties
```properties
spring.datasource.url= jdbc:postgresql://localhost:5432/(Your Database Name)
spring.datasource.username= (Your Username)
spring.datasource.password= (Your Pass)

spring.jpa.hibernate.ddl-auto= none

spring.jpa.properties.hibernate.format_sql=true
spring.jpa.show-sql=true
```

### Run
```bash 
mvn spring-boot:run
```

### GET Http Response
- postman 
- curl 

## Credits
### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.2/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.1.2/reference/htmlsinge/index.html#data.sql.jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.2/reference/htmlsinge/index.html#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

