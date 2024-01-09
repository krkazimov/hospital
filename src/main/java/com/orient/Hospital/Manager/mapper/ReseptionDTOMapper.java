package com.orient.Hospital.Manager.mapper;

import com.orient.Hospital.Manager.dto.ReseptionDTO;
import com.orient.Hospital.Manager.entities.Reseption;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ReseptionDTOMapper implements Function<Reseption, ReseptionDTO> {
    @Override
    public ReseptionDTO apply(Reseption reseption) {
        PatientDTOMapper patientDTOMapper = new PatientDTOMapper();
        return new ReseptionDTO(
                reseption.getReseptionType(),
                reseption.getReseptionDate(),
                reseption.getReseptionInfo(),
                patientDTOMapper.apply(reseption.getPatient()),
                reseption.getDoctore().getId()
        );
    }
}
