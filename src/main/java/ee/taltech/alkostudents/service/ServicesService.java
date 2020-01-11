package ee.taltech.alkostudents.service;


import ee.taltech.alkostudents.model.Services;
import ee.taltech.alkostudents.repository.ServicesRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServicesService {

    private ServicesRepository repo;

    public ServicesService(ServicesRepository repo) {
        this.repo = repo;
    }

    public List<Services> getAllServices() {
        List<Services> services = new ArrayList<>();
        repo.findAll().forEach(services::add);
        return services;
    }

    public Services addService(Services service) {
        return repo.save(converter(service));
    }

    public void deleteService(Services service){
        repo.delete(service);
    }

    public Services converter(Services service) {
        Services serv = new Services();
        serv.setId(service.getId());
        serv.setServiceName(service.getServiceName());
        serv.setPrice(service.getPrice());
        serv.setDuration(service.getDuration());
        return serv;
    }

}
