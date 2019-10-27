package ee.taltech.alkostudents.Util;

import ee.taltech.alkostudents.model.Reservation;
import ee.taltech.alkostudents.model.ReservationCreationRequest;

public class ReservationServiceUtils {

    public static Reservation creationRequestMapToTicket(ReservationCreationRequest request) {
        Reservation reservation = new Reservation();
        reservation.setFirstName(request.getFirstName());
        reservation.setLastName(request.getLastName());
        reservation.setDate(request.getDate());
        reservation.setTime(request.getTime());
        reservation.setEmail(request.getEmail());
        reservation.setPhone(request.getPhone());
        reservation.setServices(request.getServices());
        return reservation;
    }

}
