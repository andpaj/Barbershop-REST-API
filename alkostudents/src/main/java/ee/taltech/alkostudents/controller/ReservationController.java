package ee.taltech.alkostudents.controller;

import ee.taltech.alkostudents.model.Reservation;
import ee.taltech.alkostudents.model.ReservationCreationRequest;
import ee.taltech.alkostudents.service.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@CrossOrigin
@RestController
@RequestMapping("/reservation")
@AllArgsConstructor
public class ReservationController {
    private ReservationService reservationService;

    @GetMapping("/get")
    public Collection<Reservation> showReservations() {
        return reservationService.getAllReservation();
    }

    /**
     * Makes reservation if data is sent using form
     * @param request data from form
     * @return PH
     */

    @PostMapping("/post")
    public Reservation createReservation(@RequestBody ReservationCreationRequest request) {
        return reservationService.addReservation(request);
    }
}
