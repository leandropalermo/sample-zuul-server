# Sample Zuul Server

=============================

### Introduction
    
   A sample Zuul Server using Spring Boot, Spring Cloud and Netflix OSS
    
   In this project there are four applications.
    
   - Eureka-Server: This application is the Server Discovery of this sample. Which all other applications are going to connected with.
   
   - My-app1: this web application that has a controller that always return the same response ("Hello World! Good Afternoon!").
   
   - My-app2: This web application is like My-app1. The only difference is the returned message ("Hello World! Good Morning!").
   
   - Zuul-Server: Zuul Server is the main application of this project. It works like a Proxy. Which all the requests made are going to passing by. 
   The Zuul Server is responsible by the redirect and the balance all requests made to the applications (My-app1 and My-app2).
   
   This program was created hoping to explain how to implement a Netflix Zuul Server. 
   This project is using Java 8, Spring Boot, Spring Cloud and NetFlix Oss.
     
     

=============================

### Prerequisities

   Required softwares components to run the program:
    
   - MVN (Apache Maven)
   - JDK 8 (Java Development Kit version 8) 
   
=============================

### Building

##### Install the softwares prerequired.

Install the JDK 8 and MVN correctly and set the required environment variables of both softwares.

##### Build the application

Inside the "samplemicroservice" folder has a .pom file. Get into this folder and type the command 'mvn clear install".
This is a maven command that make the maven download all the library necessary to run the program (you need to be connected on the internet in order to work).

After successfully executing the mvn command, it should have created a folder named "target" in every application. Inside the folder there will be a ".jar" file.

=============================

### Authors
   
   - Leandro Palermo