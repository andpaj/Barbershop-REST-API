package ee.taltech.alkostudents.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Data
@Getter
@Setter
@Entity
@Table(name = "RESERVATIONS")
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private Long phone;
    @Column(name = "services")
    private String services;
    @Column(name = "date")
    private String date;
    @Column(name = "time")
    private String time;

    public Reservation(Long id, String firstName, String lastName, String email, Long phone, String services, String date, String time) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.services = services;
        this.date = date;
        this.time = time;
    }

}
