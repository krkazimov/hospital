package com.orient.Hospital.Manager.mapper;

import com.orient.Hospital.Manager.dto.DoctoreDTO;
import com.orient.Hospital.Manager.entities.Doctore;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class DoctoreDTOMapper implements Function<Doctore, DoctoreDTO> {
    @Override
    public DoctoreDTO apply(Doctore doctore) {
        return new DoctoreDTO(doctore.getFullName(),doctore.getHospital().getHospitalId(),doctore.getStructure().getId());
    }
}
