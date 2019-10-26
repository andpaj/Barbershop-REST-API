package ee.taltech.alkostudents.model;

import ee.taltech.alkostudents.pojo.ReservationDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Long phone;
    private List<Services> services;
    private String date;
    private String time;

    public Reservation(Long id, String firstName, String lastName, String email, Long phone, List<Services> services, String date, String time) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.services = services;
        this.date = date;
        this.time = time;
    }

    public Reservation(ReservationDto reservationDto) {
        this.id = reservationDto.getId();
        this.firstName = reservationDto.getFirstName();
        this.lastName = reservationDto.getLastName();
        this.email = reservationDto.getEmail();
        this.phone = reservationDto.getPhone();
        this.services = reservationDto.getServices();
        this.date = reservationDto.getDate();
        this.time = reservationDto.getTime();
    }

}
