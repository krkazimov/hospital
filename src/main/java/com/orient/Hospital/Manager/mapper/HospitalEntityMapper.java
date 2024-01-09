package com.orient.Hospital.Manager.mapper;

import com.orient.Hospital.Manager.dto.HospitalDTO;
import com.orient.Hospital.Manager.entities.Hospital;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class HospitalEntityMapper implements Function<HospitalDTO, Hospital> {

    @Override
    public Hospital apply(HospitalDTO hospitalDTO) {
        Hospital h = new Hospital();
        h.setHospitalName(hospitalDTO.getHospitalName());
        h.setHospitalInfo(hospitalDTO.getHospitalInfo());
        h.setHospitalLogo(hospitalDTO.getHospitalLogo());
        return h;
    }
}
