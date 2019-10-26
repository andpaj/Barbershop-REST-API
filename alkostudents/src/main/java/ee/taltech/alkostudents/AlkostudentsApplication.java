package ee.taltech.alkostudents;

import ee.taltech.alkostudents.controller.ReservationController;
import ee.taltech.alkostudents.model.Reservation;
import ee.taltech.alkostudents.model.Services;
import ee.taltech.alkostudents.model.Timetable;
import ee.taltech.alkostudents.repository.ServicesRepository;
import ee.taltech.alkostudents.repository.TimetableRepository;
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
	public CommandLineRunner initStuff(ReservationService reservationService, TimetableService timetableService, ServicesRepository servicesRepository, TimetableRepository timetableRepository) {


		return (args) -> {
			Services masin = new Services(1L, "masin", 45L,40);
			Services kaarid = new Services( 2L,"kaarid", 100L,20);
			Timetable kell1 = new Timetable(1L, "13:00", true);
			Reservation reserv = new Reservation();

			List<Services> services = List.of(
					masin,
					kaarid
			);

			List<Timetable> time = List.of(kell1);
			servicesRepository.saveAll(services);
			timetableRepository.saveAll(time);
		};
				/*
				reservationService.addReservation(new Reservation(1L, "Oleg", "Potato",
						"m@m.com", 5555555L, "Masinlõikus", "25.10", "19:10"));


				timetableService.addTimesToTable();*/


	}

}
