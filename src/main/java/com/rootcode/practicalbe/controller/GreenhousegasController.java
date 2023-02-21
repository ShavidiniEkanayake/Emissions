package com.rootcode.practicalbe.controller;

import com.rootcode.practicalbe.dto.GreenhousegasDTO;
import com.rootcode.practicalbe.dto.ResponseDTO;
import com.rootcode.practicalbe.service.GreenhousegasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/greenhousegas")
@CrossOrigin
public class GreenhousegasController {

    @Autowired
    private GreenhousegasService greenhousegasService;

    @Autowired
    private ResponseDTO responseDTO;

    //enter new greenhouse gas emission
    @PostMapping("/saveNew")
    public ResponseEntity saveNew(@RequestBody GreenhousegasDTO greenhousegasDTO){
        return greenhousegasService.saveNew(greenhousegasDTO);
    }

    //get sectors which emitted more than 500 Tonnes in given year
    @GetMapping("/getSectorByYear/{year}")
    public List<GreenhousegasDTO> getSectorByYear(@PathVariable String year){
        return greenhousegasService.getSectorByYear(year);
    }

    //get sector with maximum emission of a greenhouse gas
    @GetMapping("/getMaxEmission/{year}")
    public ResponseEntity getMaxEmission(@PathVariable String year){
        return greenhousegasService.getMaxEmission(year);
    }

}
