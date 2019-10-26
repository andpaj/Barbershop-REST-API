package ee.taltech.alkostudents.controller;

import ee.taltech.alkostudents.model.Services;
import ee.taltech.alkostudents.service.ServicesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/service")
@AllArgsConstructor
public class ServicesController {

    private ServicesService servicesService;

    @GetMapping
    public List<Services> services(@RequestParam(required = false) String name) {
        return servicesService.getAllServices();
    }

    @GetMapping("/all")
    public List<Services> Services() {
        return servicesService.getAllServices2();
    }
}
