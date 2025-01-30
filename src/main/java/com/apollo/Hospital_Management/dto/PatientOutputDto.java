package com.apollo.Hospital_Management.dto;

import com.apollo.Hospital_Management.enums.Gender;
import com.apollo.Hospital_Management.enums.Symptoms;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class PatientOutputDto {
    private Long id;

    private String name;
    private  String city;
    private  String email;
    private String phone;

    @Enumerated(EnumType.STRING)
    private Symptoms symptoms;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}
