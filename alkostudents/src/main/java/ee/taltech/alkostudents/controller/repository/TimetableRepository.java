package ee.taltech.alkostudents.controller.repository;

import ee.taltech.alkostudents.model.Timetable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TimetableRepository extends JpaRepository<Timetable,Long> {

    public List<Timetable> findAll();

}
