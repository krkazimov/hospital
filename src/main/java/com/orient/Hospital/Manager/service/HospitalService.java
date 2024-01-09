package com.orient.Hospital.Manager.service;

import com.orient.Hospital.Manager.dto.HospitalDTO;
import com.orient.Hospital.Manager.entities.Hospital;
import com.orient.Hospital.Manager.mapper.HospitalEntityMapper;
import com.orient.Hospital.Manager.repository.HospitalRepository;
import com.orient.Hospital.Manager.utils.HospitalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalService {

    private final HospitalRepository hospitalRepository;
    private final HospitalEntityMapper hospitalEntityMapper;

    @Autowired
    public HospitalService(HospitalRepository hospitalRepository, HospitalEntityMapper hospitalEntityMapper) {
        this.hospitalRepository = hospitalRepository;
        this.hospitalEntityMapper = hospitalEntityMapper;
    }
    public Hospital addHospital(HospitalDTO hospital){
        return hospitalRepository.save(hospitalEntityMapper.apply(hospital));
    }
    public List<Hospital> getAllHospital(){
        return hospitalRepository.findAll();
    }
    public Optional<Hospital> getHospitalById(Long id) throws HospitalException {
        return Optional.of(hospitalRepository.findById(id).orElseThrow(() -> new HospitalException("Melumat tapilmadi", HttpStatus.NOT_FOUND)));
    }

}
