package com.apollo.Hotal_Management.entity;

import com.apollo.Hotal_Management.enums.Gender;
import com.apollo.Hotal_Management.enums.Specialisation;
import lombok.Data;

@Data
public class Doctor {
    private Long id;
    private String name;
    private Specialisation specialisation;
    private Gender gender;
    private Long salary;

}
