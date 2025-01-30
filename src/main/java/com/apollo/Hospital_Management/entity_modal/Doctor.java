package com.apollo.Hospital_Management.entity_modal;

import com.apollo.Hospital_Management.enums.City;
import com.apollo.Hospital_Management.enums.Gender;
import com.apollo.Hospital_Management.enums.Speciality;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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
