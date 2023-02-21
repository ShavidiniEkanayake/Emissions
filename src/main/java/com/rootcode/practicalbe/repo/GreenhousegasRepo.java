package com.rootcode.practicalbe.repo;

import com.rootcode.practicalbe.entity.greenhousegas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GreenhousegasRepo extends JpaRepository<greenhousegas,Integer>{
    @Query(value = "SELECT DISTINCT sector FROM greenhousegas WHERE year = ?1 AND value > 500",nativeQuery = true)
    List<String> getSectorByYear(String year);

    @Query(value = "SELECT DISTINCT sector as Max_value_sector FROM greenhousegas WHERE value = ( SELECT MAX(value) FROM greenhousegas WHERE year = ?1)",nativeQuery = true)
    String getMaxEmission(String year);

}
