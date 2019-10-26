package ee.taltech.alkostudents.controller;


import ee.taltech.alkostudents.pojo.ServicesDto;
import ee.taltech.alkostudents.service.ServicesService;
import lombok.AllArgsConstructor;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/services")
@AllArgsConstructor
public class ServicesController {
    private ServicesService servicesService;

    @GetMapping
    public List<ServicesDto> Services(@RequestParam(required = false) String name) {
        if (name == null || name.equals("")) {
            return servicesService.getAllServices();
        }
        return servicesService.getByName(name);
    }

    @GetMapping("/{id}")
    public ServicesDto getService(@PathVariable Long id) {
        return servicesService.getById(id);
    }

    @PostMapping
    public ServicesDto saveService(@RequestBody ServicesDto service){
        return servicesService.createNewService(service);
    }

    @PutMapping("/{id}")
    public ServicesDto updateService(@RequestBody ServicesDto service, @PathVariable Long id){
        return servicesService.updateService(service);
    }

    @DeleteMapping("/{id}")
    public void deleteService(@PathVariable Long id){
        servicesService.deleteService(id);
    }

}
