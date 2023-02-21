package com.rootcode.practicalbe.service;

import com.rootcode.practicalbe.controller.GreenhousegasController;
import com.rootcode.practicalbe.dto.GreenhousegasDTO;
import com.rootcode.practicalbe.dto.ResponseDTO;
import com.rootcode.practicalbe.entity.greenhousegas;
import com.rootcode.practicalbe.repo.GreenhousegasRepo;
import com.rootcode.practicalbe.util.VarList;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class GreenhousegasService {
    Logger logger = LoggerFactory.getLogger(GreenhousegasController.class);

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ResponseDTO responseDTO;

    @Autowired
    private GreenhousegasRepo greenhousegasRepo;

    //enter new greenhouse gas emission
    public ResponseEntity saveNew(GreenhousegasDTO greenhousegasDTO){
        try{
            responseDTO.setCode(VarList.RSP_SUCCESS);
            responseDTO.setMessage("Successfully added");
            responseDTO.setContent(greenhousegasDTO);
            return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);
        }catch (Exception error){
            responseDTO.setCode(VarList.RSP_ERROR);
            responseDTO.setMessage(error.getMessage());
            responseDTO.setContent(null);
            return new ResponseEntity(responseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    //get sectors which emitted more than 500 Tonnes in given year
    public List<GreenhousegasDTO> getSectorByYear(String year){
        try{
            List<greenhousegas>greenhousegasList= greenhousegasRepo.getSectorByYear(year);
            return modelMapper.map(greenhousegasList, new TypeToken<List<GreenhousegasDTO>>(){}.getType());
        }catch (Exception error){
            logger.error("Can not retrieve data");
            throw error;
        }
    }

    //get sector with maximum emission of a greenhouse gas
}
