package ee.taltech.alkostudents.service;


import ee.taltech.alkostudents.model.Services;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ServicesService {
    private ArrayList<Services> services = new ArrayList<>(Arrays.asList(
            new Services("masinlõikus", 15L),
            new Services("habemekujundamine", 20L)

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
}
