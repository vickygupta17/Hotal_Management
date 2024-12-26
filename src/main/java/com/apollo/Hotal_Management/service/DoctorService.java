package com.apollo.Hotal_Management.service;

import com.apollo.Hotal_Management.dto.DoctorInputDto;
import com.apollo.Hotal_Management.dto.DoctorOutputDto;

import java.util.List;

public interface DoctorService {
    public DoctorOutputDto getDoctor(Long id);
    public List<DoctorOutputDto> getAllDoctor();
    public DoctorOutputDto addDoctor(DoctorInputDto doctorInputDto);
    public DoctorOutputDto updateDoctor(Long id,DoctorInputDto doctorInputDto);
    public  String removeDoctor(Long id);
}
