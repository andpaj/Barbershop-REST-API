package ee.taltech.alkostudents.controller.repository;

import ee.taltech.alkostudents.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {

    Optional<Reservation> findById(Long id);

}
