package ee.taltech.alkostudents;

import ee.taltech.alkostudents.controller.ReservationController;
import ee.taltech.alkostudents.model.Reservation;
import ee.taltech.alkostudents.service.ReservationService;
import ee.taltech.alkostudents.service.TimetableService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AlkostudentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlkostudentsApplication.class, args);
	}
	@Bean
	public CommandLineRunner initStuff(ReservationService reservationService, TimetableService timetableService) {
		return (args) ->
				/*
				reservationService.addReservation(new Reservation(1L, "Oleg", "Potato",
						"m@m.com", 5555555L, "Masinlõikus", "25.10", "19:10"));

				 */
				timetableService.addTimesToTable();


	}

}
