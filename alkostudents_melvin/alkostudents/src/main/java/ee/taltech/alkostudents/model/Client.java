package ee.taltech.alkostudents.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Long phone;
    private String mail;
    private int serviceId;
    private int timeId;


    public Client(Long id, String firstName, String lastName, Long phone, String mail, int serviceId, int timeId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.mail = mail;
        this.serviceId = serviceId;
        this.timeId = timeId;
    }






}
