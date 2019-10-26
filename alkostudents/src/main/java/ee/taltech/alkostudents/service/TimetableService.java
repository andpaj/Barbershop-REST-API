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
        times.add(new Timetable("28.10", "10:00", true));
        String lastAddedTime = "10:00";
        while (!lastAddedTime.equals("19:00")) {
            String timeToAdd = nextTime(lastAddedTime);
            times.add(new Timetable("28.10", timeToAdd, true));
            lastAddedTime = timeToAdd;
        }
    }

    private String nextTime(String fromTime) {
        int hour = Integer.parseInt(fromTime.substring(0, 2));
        int minute = Integer.parseInt(fromTime.substring(fromTime.length() - 2));
        if (minute == 30) {
            hour++;
            return String.valueOf(hour + ":00");
        }
        return String.valueOf(hour + ":30");
    }
}
