package com.orient.Hospital.Manager.repository;

import com.orient.Hospital.Manager.entities.Doctore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctoreRepository extends JpaRepository<Doctore , Long> {
}
