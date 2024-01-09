package com.orient.Hospital.Manager.service;

import com.orient.Hospital.Manager.dto.PaitientDTO;
import com.orient.Hospital.Manager.entities.Patient;
import com.orient.Hospital.Manager.mapper.PatientEntitiyMapper;
import com.orient.Hospital.Manager.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    private  final PatientRepository patientRepository;
    private final PatientEntitiyMapper patientEntitiyMapper;
    @Autowired
    public PatientService(PatientRepository patientRepository, PatientEntitiyMapper patientEntitiyMapper) {
        this.patientRepository = patientRepository;
        this.patientEntitiyMapper = patientEntitiyMapper;
    }
    public Patient addPatient(PaitientDTO paitientDTO) {
        return patientRepository.save(patientEntitiyMapper.apply(paitientDTO));
    }
}
