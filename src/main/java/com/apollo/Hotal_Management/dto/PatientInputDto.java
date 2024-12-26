package com.apollo.Hotal_Management.dto;


import com.apollo.Hotal_Management.enums.Gender;
import com.apollo.Hotal_Management.enums.Symptoms;
import lombok.Data;

@Data
public class PatientInputDto {
    private String name;
    private Symptoms symptoms;
    private Gender gender;

}
