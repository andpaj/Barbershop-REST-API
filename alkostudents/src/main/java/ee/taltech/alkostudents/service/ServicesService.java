package ee.taltech.alkostudents.service;


import ee.taltech.alkostudents.model.Services;
import ee.taltech.alkostudents.repository.ServicesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ServicesService {

    private final ServicesRepository servicesRepository;

    private ArrayList<Services> services = new ArrayList<>(Arrays.asList(
            new Services(1L,"masinlõikus", 15L, 30),
            new Services(2L, "habemekujundamine", 20L, 30)

    ));

    public List<Services> getAllServices() {
        if (!services.isEmpty()) {
            return services;
        }
        return new ArrayList<>();
    }

    public void addServices(Services service) {
        services.add(service);
    }

    public List<Services> getAllServices2() {

        return servicesRepository.findAll();
    }
}
