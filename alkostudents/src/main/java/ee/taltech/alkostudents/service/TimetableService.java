package ee.taltech.alkostudents.service;

import ee.taltech.alkostudents.model.Timetable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TimetableService {

    private ArrayList<Timetable> times = new ArrayList<>();

    public List<Timetable> getAllTimetables() {
        if (!times.isEmpty()) {
            return times;
        }
        return new ArrayList<>();
    }

    public void addTimesToTable() {
        while (true) {
            times.add(new Timetable("28.10", nextTime(), true));
        }
    }

    public String nextTime(String fromTime) {

    }
}
