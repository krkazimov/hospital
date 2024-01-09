package com.orient.Hospital.Manager.mapper;

import com.orient.Hospital.Manager.dto.PaitientDTO;
import com.orient.Hospital.Manager.entities.Patient;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class PatientDTOMapper implements Function<Patient, PaitientDTO> {
    @Override
    public PaitientDTO apply(Patient patient) {
        return new PaitientDTO(
                patient.getFullName(),
                patient.getBirthday(),
                patient.getPhone(),
                patient.getInfo());
    }
}
