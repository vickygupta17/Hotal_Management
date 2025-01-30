package com.apollo.Hospital_Management.service;

import com.apollo.Hospital_Management.dto.DoctorInputDto;
import com.apollo.Hospital_Management.dto.DoctorOutputDto;

import java.util.List;

public interface DoctorService {
    DoctorOutputDto getDoctor(Long id);
    List<DoctorOutputDto> getAllDoctor();
    DoctorOutputDto addDoctor(DoctorInputDto doctorInputDto);
    DoctorOutputDto updateDoctor(Long id,DoctorInputDto doctorInputDto);
    String removeDoctor(Long id);
}
