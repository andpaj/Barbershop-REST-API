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


/*
    public static void main(String[] args) {
        ReservationService test = new ReservationService();
        test.addReservation(new Reservation(1L, "Oleg", "Potato",
                "m@m.com", 5555555L, "Masinlõikus", "25.10", "19:10"));
    }
 */


}
