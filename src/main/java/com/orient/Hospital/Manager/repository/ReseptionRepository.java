package com.orient.Hospital.Manager.repository;

import com.orient.Hospital.Manager.entities.Reseption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReseptionRepository extends JpaRepository<Reseption, Long> {
}
