package com.apollo.Hotal_Management.dto;

import com.apollo.Hotal_Management.enums.Gender;
import com.apollo.Hotal_Management.enums.Specialisation;
import lombok.Data;

@Data
public class DoctorInputDto {
    private  String name;
    private Specialisation specialisation;
    private Gender gender;
    private Long salary;
}
