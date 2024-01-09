package com.orient.Hospital.Manager.mapper;

import com.orient.Hospital.Manager.dto.ReseptionDTO;
import com.orient.Hospital.Manager.entities.Doctore;
import com.orient.Hospital.Manager.entities.Patient;
import com.orient.Hospital.Manager.entities.Reseption;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ReseptionEntitiyMapper implements Function<ReseptionDTO, Reseption> {
    @Override
    public Reseption apply(ReseptionDTO reseptionDTO) {

        Reseption reseption = new Reseption();
        reseption.setReseptionType(reseptionDTO.getReseptionType());
        reseption.setReseptionDate(reseptionDTO.getReseptionDate());
        reseption.setReseptionInfo(reseptionDTO.getReseptionInfo());

        Doctore doctore = new Doctore();
        doctore.setId(reseptionDTO.getDoctorId());
        reseption.setDoctore(doctore);


        return reseption;
    }
}
