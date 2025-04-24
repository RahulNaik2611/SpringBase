# 🚀 Spring Boot Learning Journey

Welcome to my **Spring Boot learning repository**! This repo is a collection of small projects, practice apps, and concepts I'm exploring as I dive deep into the world of **Spring Boot** and modern Java development.

---

# 📘 Spring Boot Playground 🚀

Welcome to my **Spring Boot Playground**! This repository is my personal sandbox where I experiment with Spring Boot fundamentals and explore the framework's features in depth. It contains a collection of mini-projects designed to strengthen my understanding and sharpen my skills in the Spring ecosystem.

---

## 🛠️ What's Inside?

This repository includes multiple **standalone Spring Boot mini-projects**, each focusing on different aspects of the framework:

- **Core Concepts**: Dependency Injection (DI), Spring AOP, Bean Lifecycle  
- **Spring Data JPA**: CRUD operations, Query Methods, Relationships  
- **REST APIs**: Controllers, Exception Handling, HATEOAS  
- **Spring Security**: Authentication, Authorization, JWT  
- **Real-World Use Cases**: Voting apps, social media console apps, and more!  

*(More projects will be added as I explore advanced topics like Microservices, Spring Cloud, and Spring Batch!)*  

---

## 🚀 Why Explore This Repository?

✅ **Hands-On Learning** – Learn by building practical, real-world-inspired applications.  
✅ **Annotation & Configuration Mastery** – Covers XML, JavaConfig, and annotations.  
✅ **Growing Complexity** – Projects evolve from basics to advanced topics.  
✅ **Real-World Scenarios** – Solutions focus on maintainability and scalability.  

---



## 📂 Projects So Far

| Project Name               | Description                                                              | Status     |
|----------------------------|---------------------------------------------------------------------------|------------|
| `spring-core-tax`          | Basic tax calculator using Spring Core with XML-based configuration       | ✅ Complete |
| `laptop-dealer`            | Creating combinations of laptops and processors using Spring Beans        | ✅ Complete |
| `social-media-console-app` | Console app for posting and viewing messages using Spring XML config      | ✅ Complete |
| `Voting-console-app`       | voting and viewing results using **Spring annotations** (no XML config)   | ✅ Complete |
| _...more coming soon..._   | More projects to be added as I progress                                   | 🚧 WIP      |


---

## 🛣️ Learning Roadmap

Here's the path I'm following as I build up my Spring Boot skills:

1. ✅ Spring Core (XML and Annotation Configuration)
2. 🔄 Spring Boot Basics
3. 🔄 Spring Boot with REST APIs (Spring Web)
4. 🔄 Spring Data JPA (with H2 / MySQL)
5. 🔄 Exception Handling
6. 🔄 Unit Testing with JUnit & Mockito
7. 🔄 Building full-stack apps (Spring Boot + React)

---

## 💡 Skills I’m Focusing On

- ✅ Java + OOP Principles
- ✅ Spring Core (IoC, DI)
- 🔄 Spring Boot Auto-configuration
- 🔄 RESTful Web Services
- 🔄 Spring MVC
- 🔄 JPA / Hibernate
- 🔄 Connecting with databases (H2, MySQL)
- 🔄 Layered architecture (Controller, Service, Repository)

---

## 📅 Timeline

| Date       | Milestone                                   |
|------------|---------------------------------------------|
| Apr 2025   | Started learning Spring Core                |
| Apr 2025   | Completed first XML-based Spring project    |
| Apr 2025   | Completed first Spring annotation-based project (Voting Application) |
| Apr 2025   | Started learning Spring Boot                |


## 📎 How to Run Projects

Each mini-project will have:
- Its own `README.md`
- Instructions to run using `Maven` or `Spring Boot`

To run a project:

```bash
cd project-folder
./mvnw spring-boot:run
```

---

## 🚀 Spring Core Learning – Tax Calculation System

Welcome to my Spring learning repository! 🚀  
This project marks the beginning of my journey into the world of **Spring Framework** and **Spring Boot**. I'm starting with the **basics of Spring Core**, focusing on **Inversion of Control (IoC)** and **Dependency Injection (DI)** using XML-based configuration.

### 📘 What This Project Covers

- Understanding and using **Spring beans** via XML configuration.
- Creating and managing **interfaces and their implementations**.
- Injecting dependencies using the **Spring ApplicationContext**.
- Applying these concepts in a real-world-like scenario: a **tax calculator**.

---

## 💻 Laptop Dealer (`spring-core-laptop-dealer`)

A simulation of a laptop store that sells different laptops (Dell, MacBook, Windows) with various processors (i3, i5, i7), configured using **constructor injection** in Spring XML.

### 🧠 What I Learned:

- Constructor-based dependency injection
- Reusability through interfaces
- Creating multiple combinations of laptops with processors using Spring beans

### 🔧 Features:

- Clean separation between brand and processor
- Uses Spring container to assemble configurations

---

## 📱 Social Media Console App (`spring-core-social-media-app`)

A simple **console-based Social Media application** built using **Spring Framework (XML configuration)**.  
This project demonstrates how to use interfaces, Spring beans, and Dependency Injection to simulate user-generated posts.

### 🔧 Features:

- 👤 Set a username
- 📝 Create new posts
- 📋 View all posts

### 🧠 Concepts Used:

- XML-based Spring Bean configuration
- Manual Dependency Injection
- Interfaces and their implementations
- Spring ApplicationContext usage

---

## 🗳️ Voting Application (Console-Based)

This is a simple **Java + Spring** based console application that simulates a basic voting system. It allows users to vote for political parties and provides an admin view to see all submitted votes.

This project helped me learn and implement **Spring annotations**, **Bean scope**, and **Autowire** concepts without using the `applicationContext.xml` file, relying solely on annotations for configuration.

### 🚀 Features:

- Users can vote for one of three political parties.
- Admin can view the full list of voters and their choices.
- Uses **Spring annotations** for bean configuration (`@Component`, `@Scope`, `@Autowired`).
- Lifecycle methods (`@PostConstruct`, `@PreDestroy`) for simulating DB connections and shutdown.
- Demonstrates **prototype bean scope** to ensure each vote is handled independently.

### 🛠️ Tech Stack:

- Java 17+
- Spring Framework (Core, Context)
- Maven
- Console I/O (Scanner)



