package com.apollo.Hospital_Management.dto;

import com.apollo.Hospital_Management.enums.City;
import com.apollo.Hospital_Management.enums.Gender;
import com.apollo.Hospital_Management.enums.Speciality;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class DoctorInputDto {
    private String name;

    @Enumerated(EnumType.STRING)
    private City city;

    private  String email;
    private  String phone;

    @Enumerated(EnumType.STRING)
    private Speciality speciality;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}
