package com.orient.Hospital.Manager.controllers;

import com.orient.Hospital.Manager.dto.HospitalDTO;
import com.orient.Hospital.Manager.entities.Hospital;
import com.orient.Hospital.Manager.service.HospitalService;
import com.orient.Hospital.Manager.utils.HospitalException;
import com.orient.Hospital.Manager.utils.ResponseHandler;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/hospitals")
public class HospitalController {

    private final HospitalService hospitalService;

    @Autowired
    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    @PostMapping(path = "/store")
    public ResponseEntity<Object> storeHospital(@RequestBody @Valid HospitalDTO hospital) {

        return ResponseHandler.generatedResponse("yaradildi", HttpStatus.OK, hospitalService.addHospital(hospital));

    }
    @GetMapping
    public  ResponseEntity<Object> getAllHospital(){
        return ResponseHandler.generatedResponse( "Melumat ugurla getirildi", HttpStatus.OK,hospitalService.getAllHospital());
    }
    @GetMapping(value = "/by-id/{id}")
    public ResponseEntity<Object> getHospitalById(@PathVariable Long id){

        try {
            return ResponseHandler.generatedResponse("Melumat ugurla getirildi", HttpStatus.OK,hospitalService.getHospitalById(id));
        }catch (HospitalException e){
            return ResponseHandler.generatedErrorResponse(e.getMessages(),e.getStatus());
        }
    }
}