package com.orient.Hospital.Manager.mapper;

import com.orient.Hospital.Manager.dto.HospitalDTO;
import com.orient.Hospital.Manager.entities.Hospital;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class HospitalDtoMapper implements Function<Hospital, HospitalDTO> {
    @Override
    public HospitalDTO apply(Hospital hospital) {
        return new HospitalDTO(hospital.getHospitalName(), hospital.getHospitalInfo(), hospital.getHospitalLogo());
    }
}
