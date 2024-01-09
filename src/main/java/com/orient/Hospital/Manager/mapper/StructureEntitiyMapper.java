package com.orient.Hospital.Manager.mapper;

import com.orient.Hospital.Manager.dto.StructureDTO;
import com.orient.Hospital.Manager.entities.Hospital;
import com.orient.Hospital.Manager.entities.Structure;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class StructureEntitiyMapper implements Function<StructureDTO, Structure> {
    @Override
    public Structure apply(StructureDTO structureDTO) {
        Structure structure = new Structure();
        structure.setStuructureName(structureDTO.getName());
        structure.setStuructureLogo(structureDTO.getLogo());

        Hospital hospital = new Hospital();
        hospital.setHospitalId(structureDTO.getHospitalId());

        structure.setHospital(hospital);

        return structure;
    }
}
