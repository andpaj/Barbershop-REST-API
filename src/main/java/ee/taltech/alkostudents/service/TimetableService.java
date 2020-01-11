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
    public List<String> freeTimes() {

        ArrayList<String> times = new ArrayList<>();
        for (int i = 0; i < 18 - 9; i++) {
            String timeFull = (i + 9) + ":00";
            String timeHalf = (i + 9) + ":30";
            times.add(timeFull);
            if (!timeHalf.equals("17:30")) {
                times.add(timeHalf);
            }
        }
        List<String> finalTimes = removeTimesFromListIfUsed(times);
        //System.out.print(finalTimes);
        return finalTimes;
    }

    private List<String> removeTimesFromListIfUsed(List<String> times) {
        ArrayList<String> usedTimes = new ArrayList<>();
        //testTimes.add("14:30");
        for (int i = 0; i < usedTimes.size(); i++) {
            if (times.contains(usedTimes.get(i))) {
                times.remove(usedTimes.get(i));
            }
        }
        return times;
    }
}
