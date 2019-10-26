package ee.taltech.alkostudents.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ServicesDto {

    private Long id;
    private String name;
    private String description;

    public ServicesDto(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}

