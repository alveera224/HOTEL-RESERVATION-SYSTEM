package com.hotel.ui;

import com.hotel.model.Reservation;
import com.hotel.service.ReservationService;

import java.util.Scanner;

public class MainMenu {
    private final ReservationService reservationService = new ReservationService();

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Reservation");
            System.out.println("2. View All Reservations");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addReservation(scanner);
                    break;
                case 2:
                    viewAllReservations();
                    break;
                case 0:
                    System.out.println("Thank you for using the system.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void addReservation(Scanner scanner) {
        System.out.print("Enter guest name: ");
        String guestName = scanner.next();
        System.out.print("Enter room number: ");
        int roomNumber = scanner.nextInt();
        System.out.print("Enter contact number: ");
        String contactNumber = scanner.next();

        Reservation reservation = new Reservation();
        reservation.setGuestName(guestName);
        reservation.setRoomNumber(roomNumber);
        reservation.setContactNumber(contactNumber);

        try {
            reservationService.addReservation(reservation);
            System.out.println("Reservation added successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void viewAllReservations() {
        try {
            reservationService.getAllReservations().forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
