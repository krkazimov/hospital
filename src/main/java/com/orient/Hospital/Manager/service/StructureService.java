package com.orient.Hospital.Manager.service;

import com.orient.Hospital.Manager.dto.StructureDTO;
import com.orient.Hospital.Manager.entities.Structure;
import com.orient.Hospital.Manager.mapper.StructureEntitiyMapper;
import com.orient.Hospital.Manager.repository.StructureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StructureService {
    private final StructureRepository structureRepository;
    private final StructureEntitiyMapper structureEntitiyMapper;
    @Autowired
    public StructureService(StructureRepository structureRepository, StructureEntitiyMapper structureEntitiyMapper) {
        this.structureRepository = structureRepository;
        this.structureEntitiyMapper = structureEntitiyMapper;
    }

    public Structure addStructure(StructureDTO structureDTO){
        return structureRepository.save(structureEntitiyMapper.apply(structureDTO));
    }
}
