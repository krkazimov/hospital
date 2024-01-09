package com.orient.Hospital.Manager.mapper;

import com.orient.Hospital.Manager.dto.PaitientDTO;
import com.orient.Hospital.Manager.entities.Patient;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class PatientEntitiyMapper implements Function<PaitientDTO, Patient> {

    @Override
    public Patient apply(PaitientDTO paitientDTO) {

        Patient patient = new Patient();
        patient.setFullName(paitientDTO.getFullName());
        patient.setBirthday(paitientDTO.getBirthday());
        patient.setPhone(paitientDTO.getPhone());
        patient.setInfo(paitientDTO.getInfo());

        return patient;
    }
}
