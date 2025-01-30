package com.apollo.Hospital_Management.service;

import com.apollo.Hospital_Management.dto.DoctorOutputDto;
import com.apollo.Hospital_Management.dto.PatientInputDto;
import com.apollo.Hospital_Management.dto.PatientOutputDto;

import java.util.List;

public interface PatientService {
     PatientOutputDto getPatient(Long id);
     List<PatientOutputDto> getAllPatients();
     PatientOutputDto addPatient(PatientInputDto patientInputDto);
     PatientOutputDto updatePatient(Long id, PatientInputDto patientInputDto);
     String removePatient(Long id);
     List<DoctorOutputDto> suggestDoctor(Long id);

}
