# Day 02 - Introduction to Spring Boot with Spring Tool Suite 4 🚀

## Overview 📘
In Day 02 of our Spring Boot practicals, we will introduce the basics of setting up and working with Spring Boot using **Spring Tool Suite (STS) 4.0**. The focus of this session is on creating a simple Spring Boot application and defining basic REST API endpoints.

---

## Topics Covered 📝

### 1. Spring Boot Setup:
- Installation and configuration of **Spring Tool Suite 4.0**.
- Creating a new **Spring Boot project** in STS.

### 2. REST API Basics:
- Understanding the structure of a **Spring Boot project**.
- Creating a basic **controller class**.
- Defining API endpoints using `@RestController` and `@RequestMapping`.

---

## Practical Exercise 💡

### 1. Creating a Simple Spring Boot Application

**Problem Specification:**  
In this exercise, we will develop a Spring Boot application that defines basic API endpoints which return simple messages.

### Implementation Steps:

1. **Create a Spring Boot project** using Spring Tool Suite 4.0.
2. **Define a controller class** `AppController` inside the `com.example.firstapp.controller` package.
3. Implement two **REST API endpoints** that return simple text responses.

---

### Expected Outputs 🖥️

- **Accessing the `/msg` endpoint:**

  - **URL:** `http://localhost:8080/app/msg`
  - **Output:**
    ```
    Hello Springboot
    ```

- **Accessing the `/name` endpoint:**

  - **URL:** `http://localhost:8080/app/name`
  - **Output:**
    ```
    My Name is Springboot
    ```

---

## Purpose 🎯

The main goal of this exercise is to provide a foundation for:

- Understanding the **basic structure** of a Spring Boot project.
- Defining and handling **REST API endpoints**.
- Laying the groundwork for more advanced topics such as **dependency injection**, **service layers**, and **database integration** in Spring Boot.

---

### Next Steps 🚀
- Explore advanced Spring Boot concepts like service layers, database integration, and error handling.
- Experiment with more complex RESTful services, including HTTP methods like `POST`, `PUT`, and `DELETE`.
