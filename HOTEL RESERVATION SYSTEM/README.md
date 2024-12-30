# Hotel Reservation System

## Project Overview
The **Hotel Reservation System** is a Java-based console application designed to manage hotel reservations. It allows users to perform various operations such as adding reservations, viewing existing reservations, updating guest details, and deleting reservations. This project uses **JDBC** to interact with a **MySQL database** and follows an **MVC (Model-View-Controller)** architecture for modularity and scalability.

---

## Key Features
- **Add Reservations**: Record guest details, room numbers, and contact information in the database.
- **View Reservations**: Display a list of all current reservations.
- **Update Reservations**: Modify existing reservations, such as guest name, room number, or contact information.
- **Delete Reservations**: Remove outdated or incorrect reservations from the database.
- **Retrieve Room Number**: Fetch room numbers based on reservation IDs and guest names.

---

## Technologies Used
- **Programming Language**: Java
- **Database**: MySQL
- **Database Connectivity**: JDBC (Java Database Connectivity)
- **Libraries**: MySQL Connector/J (JDBC Driver)

---

## Project Structure
HotelReservationSystem/ │ ├── src/ # Source code folder │ ├── com/ │ │ ├── hotel/ │ │ │ ├── dao/ # Data Access Object (DAO) classes for database operations │ │ │ │ ├── DBConnection.java │ │ │ │ ├── ReservationDAO.java │ │ │ ├── model/ # Model classes representing database entities │ │ │ │ ├── Reservation.java │ │ │ ├── service/ # Service classes handling business logic │ │ │ │ ├── ReservationService.java │ │ │ ├── ui/ # User interface classes │ │ │ │ ├── MainMenu.java │ │ │ ├── HotelReservationSystem.java │ ├── resources/ # SQL scripts and configuration files │ ├── schema.sql # Database schema │ ├── data.sql # Sample data │ ├── lib/ # External libraries (e.g., MySQL Connector) │ ├── mysql-connector-java-X.X.X.jar │ ├── README.md # Documentation └── .gitignore # Git ignore rules


---

## Database Schema
The application uses the following schema for the `reservations` table:

```sql
CREATE DATABASE hotel_db;

USE hotel_db;

CREATE TABLE reservations (
    reservation_id INT AUTO_INCREMENT PRIMARY KEY,
    guest_name VARCHAR(100) NOT NULL,
    room_number INT NOT NULL,
    contact_number VARCHAR(15) NOT NULL,
    reservation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO reservations (guest_name, room_number, contact_number)
VALUES ('John Doe', 101, '1234567890');

## Usage
Launch the application and select from the available options:
Add Reservations: Enter guest details, room number, and contact information.
View Reservations: View a table of all reservations.
Update/Delete Reservations: Modify or delete reservations using their IDs.
Follow the on-screen prompts to perform actions.

## Requirements
Java: JDK 8 or above
MySQL: MySQL Server 8.0 or above
MySQL Connector: Version 8.x (included in the lib/ folder)

Future Enhancements
Add a Graphical User Interface (GUI) for better usability.
Enable email notifications for reservation confirmations.
Implement search functionality to filter reservations by date, guest name, or room number.
Convert the project to a web-based application using frameworks like Spring Boot.

## Contributing
Fork this repository.
Create a new branch (git checkout -b feature-branch).
Commit your changes (git commit -m "Add new feature").
Push to the branch (git push origin feature-branch).
Open a Pull Request.
