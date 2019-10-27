package ee.taltech.alkostudents.controller;

import ee.taltech.alkostudents.model.Services;
import ee.taltech.alkostudents.service.ServicesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/services")
@AllArgsConstructor
public class ServicesController {

    private ServicesService servicesService;

    //ArrayList
    @GetMapping("/get")
    public List<Services> services(@RequestParam(required = false) String name) {
        return servicesService.getAllServices();
    }

    //Database
    @GetMapping("/all")
    public List<Services> Services() {
        return servicesService.getAllServices2();
    }
}
