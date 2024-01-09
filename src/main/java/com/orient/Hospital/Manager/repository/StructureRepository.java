package com.orient.Hospital.Manager.repository;

import com.orient.Hospital.Manager.entities.Structure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StructureRepository extends JpaRepository<Structure, Long> {
}
