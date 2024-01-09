package com.orient.Hospital.Manager.controllers;

import com.orient.Hospital.Manager.dto.ReseptionDTO;
import com.orient.Hospital.Manager.entities.Patient;
import com.orient.Hospital.Manager.entities.Reseption;
import com.orient.Hospital.Manager.service.PatientService;
import com.orient.Hospital.Manager.service.ReseptionService;
import com.orient.Hospital.Manager.utils.ResponseHandler;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/reseption")
public class ReseptionController {
    private final ReseptionService reseptionService;
    private  final PatientService patientService;
    @Autowired
    public ReseptionController(ReseptionService reseptionService, PatientService patientService) {
        this.reseptionService = reseptionService;
        this.patientService = patientService;
    }

    @PostMapping
    public ResponseEntity<Object> store(@RequestBody  ReseptionDTO reseptionDTO){
//        Patient p = patientService.addPatient(reseptionDTO.getPaitient());
//        if (p.getId() != null){
//            Reseption r = reseptionService.addReseption(reseptionDTO);
//            return ResponseHandler.generatedResponse("Melumat ugurla getirildi", HttpStatus.OK, r);
//        }
        return ResponseHandler.generatedResponse("Melumat ugurla getirildi", HttpStatus.OK, null);
    }

    @GetMapping
    public ResponseEntity<Object> getAllReseption(){
        return ResponseHandler.generatedResponse("Melumat ugurla getirildi", HttpStatus.OK, null);
    }
}
