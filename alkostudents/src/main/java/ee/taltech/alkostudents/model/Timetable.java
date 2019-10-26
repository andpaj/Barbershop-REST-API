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
public class Timetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long timeId;
    private String time;
    private boolean free;

    public Timetable(Long timeId, String time, boolean free) {
        this.timeId = timeId;
        this.time = time;
        this.free = free;
    }
}
