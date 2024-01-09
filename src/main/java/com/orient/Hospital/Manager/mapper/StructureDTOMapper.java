package com.orient.Hospital.Manager.mapper;

import com.orient.Hospital.Manager.dto.StructureDTO;
import com.orient.Hospital.Manager.entities.Structure;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class StructureDTOMapper implements Function<Structure, StructureDTO> {
    @Override
    public StructureDTO apply(Structure structure) {
        return new StructureDTO(
                structure.getStuructureName(),
                structure.getStuructureLogo(),
                structure.getHospital().getHospitalId()
                );
    }
}
