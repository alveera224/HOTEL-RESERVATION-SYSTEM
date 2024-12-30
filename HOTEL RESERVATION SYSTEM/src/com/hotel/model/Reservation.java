package com.hotel.model;

import java.time.LocalDateTime;

public class Reservation {
    private int reservationId;
    private String guestName;
    private int roomNumber;
    private String contactNumber;
    private LocalDateTime reservationDate;

    // Getters and Setters
    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    // Constructor
    public Reservation() {}

    public Reservation(int reservationId, String guestName, int roomNumber, String contactNumber, LocalDateTime reservationDate) {
        this.reservationId = reservationId;
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.contactNumber = contactNumber;
        this.reservationDate = reservationDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", guestName='" + guestName + '\'' +
                ", roomNumber=" + roomNumber +
                ", contactNumber='" + contactNumber + '\'' +
                ", reservationDate=" + reservationDate +
                '}';
    }
}

