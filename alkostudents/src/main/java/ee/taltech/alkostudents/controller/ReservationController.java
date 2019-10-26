package ee.taltech.alkostudents.controller;

import ee.taltech.alkostudents.model.Reservation;
import ee.taltech.alkostudents.service.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
@AllArgsConstructor
public class ReservationController {
    private ReservationService reservationService;

    @GetMapping
    public List<Reservation> reservations(@RequestParam(required = false) String name) {
        return reservationService.getAllReservation();
    }

    /**
     * Makes reservation if data is sent using form
     * @param reservation data from form
     * @return PH
     */
    /*
    @PostMapping
    public String createReservation(@ModelAttribute Reservation reservation) {
        reservationService.addReservation(reservation);
        return "win";
    }
    
     */

    /**
     * Makes reservation if data is sent using form
     * @param reservation data from form
     * @return PH
     */

    @PostMapping
    public String createReservation(@RequestBody Reservation reservation) {
        reservationService.addReservation(reservation);
        return "win";
    }


}
