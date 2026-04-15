CREATE DATABASE vehicle_db;
USE vehicle_db;

CREATE TABLE vehicles (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    status VARCHAR(20)
);
