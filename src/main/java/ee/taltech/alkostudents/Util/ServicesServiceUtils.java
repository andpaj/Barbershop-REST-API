package ee.taltech.alkostudents.Util;

import ee.taltech.alkostudents.model.Services;
import ee.taltech.alkostudents.model.ServicesCreationRequest;
public class ServicesServiceUtils {

    public static Services creationRequestMapToTicket(ServicesCreationRequest request) {
        Services services = new Services();
        services.setServiceName(request.getServiceName());
        services.setPrice(request.getPrice());
        services.setDuration(request.getDuration());

        return services;
    }


}
