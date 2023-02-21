package com.rootcode.practicalbe.repo;

import com.rootcode.practicalbe.entity.greenhousegas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GreenhousegasRepo extends JpaRepository<greenhousegas,Integer>{
    @Query(value = "SELECT sector FROM greenhousegas WHERE year = ?1",nativeQuery = true)
    greenhousegas getSectorByYear(String year);
}
