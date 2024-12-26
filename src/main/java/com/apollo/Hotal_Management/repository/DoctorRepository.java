package com.apollo.Hotal_Management.repository;

import com.apollo.Hotal_Management.entity.Doctor;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DoctorRepository {

    public Map<Long, Doctor> doctors = new HashMap<>();
    public Long id = 0L;
}
