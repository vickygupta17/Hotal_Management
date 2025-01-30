package com.apollo.Hospital_Management.repository;

import com.apollo.Hospital_Management.entity_modal.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {

}
