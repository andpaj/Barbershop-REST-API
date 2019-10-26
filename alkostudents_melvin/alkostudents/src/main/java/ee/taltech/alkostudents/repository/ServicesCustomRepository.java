package ee.taltech.alkostudents.repository;

import ee.taltech.alkostudents.model.Services;
import java.util.List;

public interface ServicesCustomRepository {

    List<Services> findByName2(String name);
}
