# Advanced Java Assessment (Week 1)

-----------

# Week 1 – TechEdge University Management System

## Description
The **TechEdge University System** manages departments and students within a university.  
The system replaces manual spreadsheet management with a **Java application using Spring Core and Hibernate (JPA)** for efficient academic data management.

## Technologies Used
- Java
- Spring Core
- Hibernate (JPA)
- Maven
- PostgreSQL
- Ehcache

## Entities

### Department
- id
- name
- students

### Student
- id
- name
- email
- department

### Relationship
```
One Department -> Many Students  
Many Students -> One Department
```

## Features
- Add new departments
- Add students
- Assign students to departments
- View students by department
- Update student details
- Delete students or departments
- Hibernate Lazy Loading
- Second-Level Cache using Ehcache

## Core Operations
- `addDepartment()`
- `addStudent()`
- `assignStudentToDepartment()`
- `getDepartmentById()`
- `viewStudentsByDepartment()`
- `updateStudent()`
- `deleteStudent()`
- `deleteDepartment()`

---

# How to Run the Projects

## Clone the Repository
```bash
git clone https://github.com/your-username/repository-name.git
```

## Navigate to the Project
```
cd repository-name
```

## Build the Project
```
mvn clean install
```

## Run the Application
```
mvn spring-boot:run
```

---
