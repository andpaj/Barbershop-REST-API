package ee.taltech.alkostudents.payload;

import lombok.Data;


@Data
public class ReservationCreationRequest {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Long phone;
    private String services;
    private String date;
    private String time;
}
