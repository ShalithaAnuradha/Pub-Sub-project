# Pub-Sub-project
This is a small application to show the publisher - subscriber flow of Kafka using spring boot

# How to run
To run the project, please follow the below steps

## First run Zookeeper server and Kafka Server ## 

	Open Source Kafka Startup commands in local are shown below

	1. Start Zookeeper Server

    		```sh bin/zookeeper-server-start.sh config/zookeeper.properties```

	2. Start Kafka Server / Broker

    		```sh bin/kafka-server-start.sh config/server.properties```
    
    
## Second run the producer spring boot project 
	Find the pom file and select open as project
	Run command ```mvn clean install``` and then run the project

## Third run the consumer spring boot project
	Find the pom file and select open as project
	Run command ```mvn clean install``` and then run the project

## Send a POST request using postman or any other client to the producer to below link with below request body (example)
	request link:  http://localhost:9191/producer/publish
	request body: {
    "id":5,
    "sender": "shalitha@gmail.com",
    "receiver":"abc@gmail.com",
    "subject" : "It's all about Kafka",
    "msgBody": "Apache Kafka is a distributed event store and stream-processing platform. It is an open-source system developed by the Apache Software Foundation written in Java and Scala. The project aims to provide a unified, high-throughput, low-latency platform for handling real-time data feeds." 
    }

 
	
## Now you can see the request and response flow in pub - sub flow
## You can check the flow with the Offset explorer application (https://www.kafkatool.com/) to have a deeper understanding.
