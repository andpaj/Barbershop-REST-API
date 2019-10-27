package ee.taltech.alkostudents.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "BARBERSERVICES")
@Entity
@NoArgsConstructor
public class Services {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String serviceName;
    private Long price;
    private int duration;

    public Services(Long id, String serviceName, Long price, int duration) {
        this.serviceName = serviceName;
        this.price = price;
        this.duration = duration;
        this.id = id;
    }
}
