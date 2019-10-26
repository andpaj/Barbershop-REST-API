package ee.taltech.alkostudents.repository;


import ee.taltech.alkostudents.model.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicesRepository extends JpaRepository<Services, Long>, ServicesCustomRepository {

    @Query("select s from Services s where upper(s.name) like concat('%', upper(:name),'%') ")
    List<Services> findByName(@Param(value = "name") String name);
}

