# 🚗 Vehicle Rental Management System (Java + PostgreSQL)

A **console-based Vehicle Rental Management System** built using **Java (JDBC)** and **PostgreSQL**.
This project demonstrates basic CRUD operations, database connectivity, and simple business logic for renting vehicles.

---

## 📌 Features

* ➕ Add new vehicles
* 📋 View all vehicles
* 🚗 Rent a vehicle
* 🔄 Return a vehicle
* 📊 View rental status
* 🔗 JDBC integration with PostgreSQL
* ✅ Input validation (improved logic)

---

## 🛠️ Tech Stack

* **Language:** Java
* **Database:** PostgreSQL
* **Connectivity:** JDBC
* **IDE:** Any (VS Code / IntelliJ / Eclipse)

---

## 📂 Project Structure

```
VehicleRentalSystem/
│── Main.java
│── VehicleService.java
│── DBConnection.java
│── database.sql
│── postgresql-42.x.x.jar (external dependency)
```

---

## ⚙️ Setup Instructions

### 1️⃣ Install PostgreSQL

Download and install PostgreSQL from:
https://www.postgresql.org/download/

---

### 2️⃣ Create Database

```sql
CREATE DATABASE vehicle_db;
```

Connect to it:

```sql
\c vehicle_db;
```

---

### 3️⃣ Create Table

```sql
CREATE TABLE vehicles (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    status VARCHAR(20)
);
```

---

### 4️⃣ Configure Database Connection

Update credentials in `DBConnection.java`:

```java
String url = "jdbc:postgresql://localhost:5432/vehicle_db";
String user = "postgres";
String password = "your_password";
```

---

### 5️⃣ Add PostgreSQL JDBC Driver

Download:
https://jdbc.postgresql.org/download/

Place `.jar` file in project folder.

---

### 6️⃣ Compile & Run

```bash
javac -cp ".;postgresql-42.x.x.jar" *.java
java -cp ".;postgresql-42.x.x.jar" Main
```

---

## ▶️ Usage

```
--- Vehicle Rental System ---
1. Add Vehicle
2. View Vehicles
3. Rent Vehicle
4. Return Vehicle
5. View Rentals
6. Exit
```

---

## ⚠️ Important Fixes Implemented

* ✔ Prevent renting already rented vehicles
* ✔ Validate vehicle ID before return
* ✔ Proper database update checks


