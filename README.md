# Doctor Management System

## Frameworks and Language Used

-Spring Boot

-Java

-MySQL

-Maven

## Data Flow

### Controller

Handles incoming HTTP requests

Calls relevant service methods

Returns HTTP responses

### Services

Contains business logic and handles data manipulation

Calls relevant repository methods

### Repository

Handles database interactions

Performs CRUD (Create, Read, Update, Delete) operations

## Database Design

Contains two tables: Doctor and Patient

Doctor table has columns: doctor_id (primary key), doctor_name, speciality, phone_number

Patient table has columns: patient_id (primary key), patient_name, age, phone_number, disease_type, gender, admit_date, doctor_id (foreign key)

## Data Structure Used

JSON for exchanging data between client and server

## Project Summary

The Doctor Management System is a web application that allows hospitals to manage their doctors and patients. The system provides the following features:

Add, view, edit, and delete doctors

Add, view, edit, and delete patients

Assign patients to doctors

View patients assigned to each doctor

View all patients in the system

Search for patients by patient ID or doctor ID

The system is built using Spring Boot and MySQL. It follows the MVC (Model-View-Controller) architectural pattern, with the Controller layer handling HTTP requests, the Service layer handling business logic, and the Repository layer handling database interactions. The data is exchanged in JSON format.
