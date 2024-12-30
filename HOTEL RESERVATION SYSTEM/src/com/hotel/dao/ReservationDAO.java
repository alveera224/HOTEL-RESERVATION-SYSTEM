package com.hotel.dao;

import com.hotel.model.Reservation;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReservationDAO {

    public void addReservation(Reservation reservation) throws SQLException {
        String sql = "INSERT INTO reservations (guest_name, room_number, contact_number) VALUES (?, ?, ?)";
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, reservation.getGuestName());
            preparedStatement.setInt(2, reservation.getRoomNumber());
            preparedStatement.setString(3, reservation.getContactNumber());
            preparedStatement.executeUpdate();
        }
    }

    public List<Reservation> getAllReservations() throws SQLException {
        String sql = "SELECT * FROM reservations";
        List<Reservation> reservations = new ArrayList<>();
        try (Connection connection = DBConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Reservation reservation = new Reservation();
                reservation.setReservationId(resultSet.getInt("reservation_id"));
                reservation.setGuestName(resultSet.getString("guest_name"));
                reservation.setRoomNumber(resultSet.getInt("room_number"));
                reservation.setContactNumber(resultSet.getString("contact_number"));
                reservation.setReservationDate(resultSet.getTimestamp("reservation_date").toLocalDateTime());
                reservations.add(reservation);
            }
        }
        return reservations;
    }
}
