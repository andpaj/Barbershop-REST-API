package ee.taltech.alkostudents.service;

import ee.taltech.alkostudents.model.Reservation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationService {

    private ArrayList<Reservation> reservations = new ArrayList<>();


    public List<Reservation> getAllReservation() {
        if (!reservations.isEmpty()) {
            return reservations;
        }
        return new ArrayList<>();
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }
}
