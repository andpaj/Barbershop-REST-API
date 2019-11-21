package ee.taltech.alkostudents.service;

import ee.taltech.alkostudents.model.Timetable;
import ee.taltech.alkostudents.repository.TimetableRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TimetableService {

    private TimetableRepository repo;

    public TimetableService(TimetableRepository repo) {
        this.repo = repo;
    }

    public List<Timetable> getAllTimes() {
        List<Timetable> timetables = new ArrayList<>();
        repo.findAll().forEach(timetables::add);
        return timetables;
    }

    public Timetable addTimes(Timetable timetables) {
        return repo.save(converter(timetables));
    }

    public Timetable converter(Timetable timetables) {
        Timetable times = new Timetable();
        times.setId(timetables.getId());
        times.setDate(timetables.getDate());
        times.setTime(timetables.getTime());
        times.setFree(timetables.getFree());
        return times;
    }

}
