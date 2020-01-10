package ee.taltech.alkostudents.service;


import ee.taltech.alkostudents.model.ServicesCreationRequest;
import ee.taltech.alkostudents.model.Services;
import ee.taltech.alkostudents.repository.ServicesRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import static ee.taltech.alkostudents.Util.ServicesServiceUtils.creationRequestMapToTicket;


@Slf4j
@Service
@RequiredArgsConstructor
public class ServicesService {

    private final ServicesRepository servicesRepository;

    public List<Services> getAllServices() {
        List<Services> services = servicesRepository.findAll();
        return services;
    }


    public Services addService(ServicesCreationRequest request) {
        Services newServices = creationRequestMapToTicket(request);
        return servicesRepository.save(newServices);
    }

}
