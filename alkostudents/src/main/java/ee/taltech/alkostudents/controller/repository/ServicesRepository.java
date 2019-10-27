package ee.taltech.alkostudents.controller.repository;

import ee.taltech.alkostudents.model.Services;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServicesRepository extends JpaRepository<Services,Long> {

    public List<Services> findAll();

}



