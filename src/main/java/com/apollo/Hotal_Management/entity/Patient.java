package com.apollo.Hotal_Management.entity;

import com.apollo.Hotal_Management.enums.Gender;
import com.apollo.Hotal_Management.enums.Symptoms;
import lombok.Data;

@Data
public class Patient {
    private Long id;
    private String name;
    private Symptoms symptoms;
    private Gender gender;

}
