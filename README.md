# 🧾 Budgeting App - Spring Boot Backend

Welcome to the backend of the Budgeting App — built using **Spring Boot**. This service is designed to handle budget data such as income, expenses, and budget categories, which can be consumed by a frontend client (CLI, web, or mobile).

This repo serves as the backend logic and REST API layer of the full budgeting application.

---

## 📌 Features

- Create, modify, and delete named budgets
- Track post-tax income and categorize expenses
- RESTful API design using Spring Web
- Future support for persistence (JPA, database integration)
- JSON request/response format

---

## 🛠 Tech Stack

- Java 17+
- Spring Boot 3+
- Maven
- Spring Web
- Spring DevTools (optional)
- Spring Data JPA + Hibernate
- H2 (DB Practice)
- (Planned) PostgreSQL / MySQL

---
📈 Future Plans

    Connect to frontend CLI or web app

    Export budget summaries
---

## 🧪 API Endpoints

> 📍 Note: These are sample/planned endpoints. They may evolve over the course of the app's development!

| Method | Endpoint                          | Description                                 |
|--------|-----------------------------------|---------------------------------------------|
| GET    | `/budgets`                        | List all budgets                            |
| GET    | `/budgets/{userId}/{budgetId}`       | List a specific budget for a specified user |
| GET    | `/budgets/{userId}/`       | List a all budgets for a specified user |
| POST   | `/budgets`                        | Create a new budget                         |
| PUT    | `/budgets/{budgetId}`                   | Modify an entire existing budget                   |
| DELETE | `/budgets/{budgetId}`                   | Delete a budget                             |
| GET    | `/budgets/{budgetId}`                   | View details of a budget                    |
| PATCH    | `/budgets/{budgetId}/{modification}`                   | Modify a specific aspect of a budget                    |

---

## 🚀 Getting Started

### Prerequisites

- Java 17+
- Maven 3.6+
- IDE like IntelliJ or VS Code


### Clone the repository

```bash
git clone https://github.com/EdwardA-II/budgeting-springboot.git
cd budgeting-springboot
```
---
![Mock Architecture Diagram with Notes](https://github.com/EdwardA-II/budgeting-springboot/blob/master/src/main/resources/Mock%20Architecture%20Diagram.png)

---
