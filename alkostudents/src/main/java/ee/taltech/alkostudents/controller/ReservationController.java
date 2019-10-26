package ee.taltech.alkostudents.controller;

import ee.taltech.alkostudents.model.Reservation;
import ee.taltech.alkostudents.service.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
