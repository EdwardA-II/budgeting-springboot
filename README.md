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
- (Planned) Spring Data JPA + H2/PostgreSQL/MySQL

---
📈 Future Plans

    Add persistence layer (Spring Data JPA + DB)

    Authentication (Spring Security)

    Connect to frontend CLI or web app

    Export budget summaries
---

## 🧪 API Endpoints

> 📍 Note: These are sample/planned endpoints. They may evolve over the course of the app's development!

| Method | Endpoint                          | Description                                 |
|--------|-----------------------------------|---------------------------------------------|
| GET    | `/budgets`                        | List all budgets                            |
| GET    | `/budgets/{user_id}/{b_id}`       | List a specific budget for a specified user |
| POST   | `/budgets`                        | Create a new budget                         |
| PUT    | `/budgets/{id}`                   | Modify an existing budget                   |
| DELETE | `/budgets/{id}`                   | Delete a budget                             |
| GET    | `/budgets/{id}`                   | View details of a budget                    |

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
