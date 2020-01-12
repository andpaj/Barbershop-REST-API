package ee.taltech.alkostudents.controller;

import ee.taltech.alkostudents.model.Timetable;
import ee.taltech.alkostudents.service.TimetableService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/times")
@AllArgsConstructor
public class TimetableController {

    private TimetableService timetableService;

    @GetMapping("/findall")
    public List<Timetable> services() {
        return timetableService.getAllTimes();
    }

    @PostMapping("/create")
    public void create(@RequestBody Timetable timetable){
        timetableService.addTimes(timetable);
    }

    @GetMapping
    public List<Timetable> times(@RequestParam(required = false) String name) {
        return timetableService.freeTimes();
    }

}
