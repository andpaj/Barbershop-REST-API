package ee.taltech.alkostudents.model;

import lombok.Data;


@Data
public class ServicesCreationRequest {
    private Long id;
    private String serviceName;
    private String price;
    private int duration;
}
