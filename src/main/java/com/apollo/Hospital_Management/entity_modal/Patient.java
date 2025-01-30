package com.apollo.Hospital_Management.entity_modal;

import com.apollo.Hospital_Management.enums.Gender;
import com.apollo.Hospital_Management.enums.Symptoms;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
