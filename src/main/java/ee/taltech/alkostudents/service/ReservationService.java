package ee.taltech.alkostudents.service;

import ee.taltech.alkostudents.model.Reservation;
import ee.taltech.alkostudents.model.ReservationCreationRequest;
import ee.taltech.alkostudents.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

import static ee.taltech.alkostudents.Util.ReservationServiceUtils.creationRequestMapToTicket;

@Slf4j
@Service
@RequiredArgsConstructor
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public List<Reservation> getAllReservation() {
        List<Reservation> reservations = reservationRepository.findAll();
        return reservations;
    }

    public Reservation addReservation(ReservationCreationRequest request) {
        Reservation newReservation = creationRequestMapToTicket(request);
        return reservationRepository.save(newReservation);
    }
}
