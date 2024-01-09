package com.orient.Hospital.Manager.controllers;

import com.orient.Hospital.Manager.dto.DoctoreDTO;
import com.orient.Hospital.Manager.service.DoctoreService;
import com.orient.Hospital.Manager.utils.ResponseHandler;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/doctore")
public class DoctoreController {

    private final DoctoreService doctoreService;
    @Autowired
    public DoctoreController(DoctoreService doctoreService) {
        this.doctoreService = doctoreService;
    }

    @PostMapping
    public ResponseEntity<Object> store(@RequestBody @Valid DoctoreDTO doctoreDTO){
        return ResponseHandler.generatedResponse("Melumat ugurla getirildi", HttpStatus.OK, doctoreService.addDoctore(doctoreDTO));
    }
    @GetMapping
    public ResponseEntity<Object> getAllDoctore(){
        return ResponseHandler.generatedResponse("Melumat ugurla getirildi", HttpStatus.OK, null);
    }

}
