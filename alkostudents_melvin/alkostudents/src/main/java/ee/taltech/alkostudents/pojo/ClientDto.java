package ee.taltech.alkostudents.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ClientDto {

    private Long id;
    private String firstName;
    private String lastName;
    private Long phone;
    private String mail;
    private int serviceId;
    private int timeId;

    public ClientDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
