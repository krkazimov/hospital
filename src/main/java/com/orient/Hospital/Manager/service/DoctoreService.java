package com.orient.Hospital.Manager.service;

import com.orient.Hospital.Manager.dto.DoctoreDTO;
import com.orient.Hospital.Manager.entities.Doctore;
import com.orient.Hospital.Manager.mapper.DoctoreEntitiyMapper;
import com.orient.Hospital.Manager.repository.DoctoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctoreService {

    private final DoctoreRepository doctoreRepository;

    private final DoctoreEntitiyMapper doctoreEntitiyMapper;

    @Autowired
    public DoctoreService(DoctoreRepository doctoreRepository, DoctoreEntitiyMapper doctoreEntitiyMapper) {
        this.doctoreRepository = doctoreRepository;
        this.doctoreEntitiyMapper = doctoreEntitiyMapper;
    }

    public Doctore addDoctore(DoctoreDTO doctoreDTO){
        return doctoreRepository.save(doctoreEntitiyMapper.apply(doctoreDTO));
    }
}
