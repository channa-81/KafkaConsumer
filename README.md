# 🚀 Kafka Consumer Application using Spring Boot

A simple Spring Boot application that demonstrates how to consume JSON messages from an Apache Kafka topic using `@KafkaListener`.

This project is part of my journey in learning **Apache Kafka**, **Event-Driven Architecture**, and **Spring Boot Microservices**.

---

## 📌 Project Overview

This application acts as a **Kafka Consumer**.

It listens to a Kafka topic, receives JSON messages published by the producer application, deserializes them into Java objects, and processes the received data.

---

## 🏗️ Architecture

```
                Apache Kafka Topic
                        │
                        ▼
             Spring Boot Consumer
                        │
                        ▼
               @KafkaListener
                        │
                        ▼
              JsonDeserializer
                        │
                        ▼
                Course Object
                        │
                        ▼
              Process / Display Data
```

---

## ✨ Features

- Consume JSON messages from Kafka
- Automatic message deserialization
- Spring Kafka integration
- REST API to retrieve consumed data
- Layered Spring Boot architecture
- Maven project structure

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring for Apache Kafka
- Apache Kafka 3.9
- ZooKeeper
- Maven
- Lombok
- REST API
- Postman
- Eclipse IDE

---

## 📂 Project Structure

```
src
 ├── main
 │   ├── java
 │   │    └── com.ypc.kafka
 │   │          ├── controller
 │   │          ├── service
 │   │          ├── consumer
 │   │          ├── model
 │   │          └── KafkaLearningApplication
 │   │
 │   └── resources
 │         └── application.properties
 │
 └── test
```

---

## ⚙️ Configuration

Example `application.properties`

```properties
spring.kafka.bootstrap-servers=localhost:9092

spring.kafka.consumer.group-id=ypc-grp

spring.kafka.consumer.key-deserializer=org.apache.kafka.common.serialization.StringDeserializer

spring.kafka.consumer.value-deserializer=org.springframework.kafka.support.serializer.JsonDeserializer

spring.kafka.consumer.properties.spring.json.trusted.packages=*

spring.kafka.consumer.properties.spring.json.value.default.type=com.ypc.kafka.model.Course
```

---

## 📮 REST API

### Get Consumed Data

**GET**

```
GET /kafka/getCourse
```

### Sample Response

```text
Course(courseId=JavaFullStack-01, title=J2EE, trainer=Channa, price=20000.0)
Successfully got data from Kafka...
```

---

## 📦 Kafka Topic

Example Topic

```
ypc
```

Consumer Group

```
ypc-grp
```

---

## 🔄 Message Flow

```
Spring Boot Producer
        │
        ▼
Apache Kafka Topic
        │
        ▼
Spring Boot Consumer
        │
        ▼
@KafkaListener
        │
        ▼
JsonDeserializer
        │
        ▼
Course Object
        │
        ▼
REST API Response
```

---

## ▶️ Running the Project

### 1. Start ZooKeeper

```bash
zookeeper-server-start.bat ..\..\config\zookeeper.properties
```

### 2. Start Kafka Broker

```bash
kafka-server-start.bat ..\..\config\server.properties
```

### 3. Run Producer Application

Publish a message to the Kafka topic.

### 4. Run Consumer Application

```bash
mvn spring-boot:run
```

### 5. Verify Message

Call the GET endpoint:

```
http://localhost:8082/kafka/getCourse
```

---

## 📖 What I Learned

- Apache Kafka Consumer
- Consumer Groups
- Kafka Topics & Partitions
- Spring Kafka
- @KafkaListener
- JSON Deserialization
- Event-Driven Communication
- Asynchronous Message Processing
- Producer-Consumer Architecture
- Kafka Message Flow

---

## 🚀 Future Improvements

- Multiple Consumers
- Offset Management
- Manual Acknowledgements
- Dead Letter Topics (DLT)
- Docker Compose Integration
- Kafka Streams
- Spring Boot Microservices
- Unit & Integration Testing

---

## 🤝 Connect with Me

If you have suggestions or feedback, feel free to connect!

**LinkedIn:**  
https://www.linkedin.com/in/channa81/

**GitHub:**  
https://github.com/channa-81

---

## ⭐ Support

If you found this project useful, consider giving it a **⭐ Star** on GitHub.

Happy Coding! 🚀
