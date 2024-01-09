package com.orient.Hospital.Manager.mapper;

import com.orient.Hospital.Manager.dto.DoctoreDTO;
import com.orient.Hospital.Manager.entities.Doctore;
import com.orient.Hospital.Manager.entities.Hospital;
import com.orient.Hospital.Manager.entities.Structure;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class DoctoreEntitiyMapper implements Function<DoctoreDTO, Doctore> {
    @Override
    public Doctore apply(DoctoreDTO doctoreDTO) {
        Doctore doctore = new Doctore();
        doctore.setFullName(doctoreDTO.getFullname());

        Hospital hospital = new Hospital();
        hospital.setHospitalId(doctoreDTO.getHospitalId());

        doctore.setHospital(hospital);

        Structure structure = new Structure();
        structure.setId(doctoreDTO.getStructureId());

        doctore.setStructure(structure);

        return doctore;
    }
}
