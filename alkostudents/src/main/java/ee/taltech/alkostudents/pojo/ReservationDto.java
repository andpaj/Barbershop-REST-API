package ee.taltech.alkostudents.pojo;

import ee.taltech.alkostudents.model.Services;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ReservationDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Long phone;
    private List<Services> services;
    private String date;
    private String time;

    public ReservationDto(Long id, String firstName, String lastName, String email, Long phone, List<Services> services, String date, String time) {
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
