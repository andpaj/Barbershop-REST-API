package ee.taltech.alkostudents.service;

import ee.taltech.alkostudents.model.Services;
import ee.taltech.alkostudents.pojo.ServicesDto;
import lombok.AllArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ServicesService {

    private final ServicesRepository servicesRepository;

    public List<ServicesDto> getAllServices() {
        return convertServices(servicesRepository.findAll());
    }

    public List<ServicesDto> getByName(String name) {
//        return convertServices(servicesRepository.findByName2(name));
        return convertServices(servicesRepository.findByName(name));
    }

    public ServicesDto getById(Long id) {
        Services services = getServicesById(id);
        ServicesDto ServicesDto = convert(services);
        if (CollectionUtils.isNotEmpty(services.getEquipment())){
            ServicesDto.setEquipment(convertEquipment(services.getEquipment()));
        }
        return ServicesDto;
    }

    private Services getServiceById(Long id) {
        return servicesRepository.findById(id).orElseThrow(ServicesNotFoundException::new);
    }

    public ServicesDto createNewServices(ServicesDto ServicesDto) {
        Services services = new Services(ServicesDto);
        if (StringUtils.isBlank(services.getName())) {
            throw new ServicesValidationException();
        }
        return convert(servicesRepository.save(services));
    }

    public ServicesDto updateServices(ServicesDto ServicesDto) {
        Services services = new Services();
        services.setId(ServicesDto.getId());
        services.setName(ServicesDto.getName());
        if (StringUtils.isBlank(services.getName())) {
            throw new ServicesValidationException();
        }
        return convert(servicesRepository.save(services));
    }

    public void deleteServices(Long id) {
        Services services = getServicesById(id);
        servicesRepository.delete(services);
    }

    private List<ServicesDto> convertServices(List<Services> byNameContaining) {
        return byNameContaining.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }


    private ServicesDto convert(Services services) {
        ServicesDto dto = new ServicesDto();
        dto.setId(services.getId());
        dto.setName(services.getName());
        return dto;
    }
}