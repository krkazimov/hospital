package com.orient.Hospital.Manager.controllers;

import com.orient.Hospital.Manager.dto.StructureDTO;
import com.orient.Hospital.Manager.service.StructureService;
import com.orient.Hospital.Manager.utils.ResponseHandler;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/structure")
public class StructureController {
    private final StructureService structureService;

    public StructureController(StructureService structureService) {
        this.structureService = structureService;
    }

    @GetMapping
    public ResponseEntity<Object> getAllSturucture(){
        return ResponseHandler.generatedResponse("Melumat ugurla getirildi", HttpStatus.OK, null);
    }
    @PostMapping
    public ResponseEntity<Object> store(@RequestBody @Valid StructureDTO structureDTO){
        return ResponseHandler.generatedResponse("Melumat ugurla getirildi", HttpStatus.OK,structureService.addStructure(structureDTO));
    }
}
