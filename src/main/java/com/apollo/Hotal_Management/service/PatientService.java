package com.apollo.Hotal_Management.service;

import com.apollo.Hotal_Management.dto.PatientInputDto;
import com.apollo.Hotal_Management.dto.PatientOutputDto;


import java.util.List;

public interface PatientService {
    public PatientOutputDto getPatient(Long id);
    public List<PatientOutputDto> getAllPatients();
    public PatientOutputDto addPatient(PatientInputDto patientInputDto);
    public PatientOutputDto updatePatient(Long id, PatientInputDto patientInputDto);
    public String removePatient(Long id);
}
