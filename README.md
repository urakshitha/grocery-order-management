# grocery-order-management

#🛒 Online Grocery Order Management System

Order Management API for Online Grocery — built using Java, Spring Boot, JPA and MySQL with DTO mapping and RESTful endpoints supporting CRUD for customers, orders, and inventory.

___

## Features
- Create and retrieve customers
- Add and list grocery items
- Place and view orders
- DTO-to-entity mapping using ModelMapper
- MySQL database integration
- Layered architecture (Controller → Service → Repository)
- Lombok for clean code

___

## Tech Stack
- Java 17+
- Spring Boot 3.x
- Spring Data JPA
- MySQL
- ModelMapper
- Lombok
- Gradle

___

## Project Structure
```
src/
├── controller  # REST Controllers
├── dto         # Data Transfer Objects
├── dtoMapper   # DTO ↔ Entity conversions
├── entity      # JPA Entities
├── repository  # JpaRepositories
├── service     # Business logic layer
└── OnlineGroceryApplication.java
```

___

## API Endpoints
### Customers
| Method | Endpoint            | Description             |
|--------|---------------------|-------------------------|
| POST   | `/api/customers`    | Create a new customer   |
| GET    | `/api/customers`    | Get all customers       |

### Grocery Items
| Method | Endpoint                 | Description              |
|--------|--------------------------|--------------------------|
| POST   | `/api/grocery-items`     | Add a grocery item       |
| GET    | `/api/grocery-items`     | Get all grocery items    |

___

### Prerequisites
- Java 17 or later
- MySQL installed and running
- Gradle installed or use the wrapper `./gradlew`

___

### Clone and Build
```bash
git clone https://github.com/urakshitha/grocery-order-management.git
cd online-grocery-order-system
./gradlew clean build

update configuration under src/main/resources/application.properties