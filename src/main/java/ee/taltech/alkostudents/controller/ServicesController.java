package ee.taltech.alkostudents.controller;

import ee.taltech.alkostudents.model.Services;
import ee.taltech.alkostudents.service.ServicesService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/services")
@AllArgsConstructor
public class ServicesController {

    private ServicesService servicesService;

    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    @GetMapping("/findall")
    public List<Services> services() {
        return servicesService.getAllServices();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public void create3(@RequestBody Services service){
        servicesService.addService(service);
        System.out.println("Service is created!");
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete")
    public void delete(@RequestBody Services service){
        servicesService.deleteService(service);
    }


}
