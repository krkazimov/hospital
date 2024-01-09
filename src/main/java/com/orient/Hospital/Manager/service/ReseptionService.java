package com.orient.Hospital.Manager.service;

import com.orient.Hospital.Manager.dto.ReseptionDTO;
import com.orient.Hospital.Manager.entities.Reseption;
import com.orient.Hospital.Manager.mapper.ReseptionEntitiyMapper;
import com.orient.Hospital.Manager.repository.ReseptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReseptionService {

    private final ReseptionRepository reseptionRepository;
    private final ReseptionEntitiyMapper reseptionEntitiyMapper;
    @Autowired
    public ReseptionService(ReseptionRepository reseptionRepository, ReseptionEntitiyMapper reseptionEntitiyMapper) {
        this.reseptionRepository = reseptionRepository;
        this.reseptionEntitiyMapper = reseptionEntitiyMapper;
    }

    public Reseption addReseption(ReseptionDTO reseptionDTO){
        return reseptionRepository.save(reseptionEntitiyMapper.apply(reseptionDTO));
    }
}
