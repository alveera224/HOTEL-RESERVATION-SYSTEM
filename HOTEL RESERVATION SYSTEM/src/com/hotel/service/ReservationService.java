package com.hotel.service;

import com.hotel.dao.ReservationDAO;
import com.hotel.model.Reservation;

import java.sql.SQLException;
import java.util.List;

public class ReservationService {
    private final ReservationDAO reservationDAO = new ReservationDAO();

    public void addReservation(Reservation reservation) throws SQLException {
        reservationDAO.addReservation(reservation);
    }

    public List<Reservation> getAllReservations() throws SQLException {
        return reservationDAO.getAllReservations();
    }
}
