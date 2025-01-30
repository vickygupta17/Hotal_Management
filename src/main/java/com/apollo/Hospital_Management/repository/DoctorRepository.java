package com.apollo.Hospital_Management.repository;

import com.apollo.Hospital_Management.entity_modal.Doctor;
import com.apollo.Hospital_Management.enums.City;
import com.apollo.Hospital_Management.enums.Gender;
import com.apollo.Hospital_Management.enums.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository  extends JpaRepository<Doctor,Long> {

    List<Doctor> findByGenderAndSpeciality(Gender gender, Speciality speciality);

    //JPQL -> Java Persistence Query Language
    @Query("SELECT d FROM Doctor d WHERE d.speciality = :speciality")
    List<Doctor> myCustomJPQLMethod(@Param("speciality") Speciality speciality);

    //Native query -> SQL Query
    @Query(value = "SELECT * FROM doctor d WHERE d.salary BETWEEN :min AND :max", nativeQuery = true)
    List<Doctor> myCustomNativeMethod(@Param("min") Long min, @Param("max") Long max);

   //Suggest doctors on basis of City and Speciality:
    List<Doctor> findByCityAndSpeciality(City city, Speciality speciality);
}
