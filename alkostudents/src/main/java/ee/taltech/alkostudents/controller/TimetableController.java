package ee.taltech.alkostudents.controller;

import ee.taltech.alkostudents.model.Timetable;
import ee.taltech.alkostudents.service.TimetableService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/times")
@AllArgsConstructor
public class TimetableController {

    private TimetableService timetableService;

    @GetMapping
    public List<Timetable> timetables(@RequestParam(required = false) String name) {
        return timetableService.getAllTimetables();
    }
}
