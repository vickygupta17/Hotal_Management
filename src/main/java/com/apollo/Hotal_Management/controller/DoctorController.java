package com.apollo.Hotal_Management.controller;

import com.apollo.Hotal_Management.dto.DoctorInputDto;
import com.apollo.Hotal_Management.dto.DoctorOutputDto;
import com.apollo.Hotal_Management.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @GetMapping("/{id}")
    public ResponseEntity<DoctorOutputDto> getDoctor(@PathVariable Long id){
        return  new ResponseEntity<>(doctorService.getDoctor(id), HttpStatusCode.valueOf(200));
    }

    @GetMapping
    public ResponseEntity<List<DoctorOutputDto>> getAllDoctors(){
        return  new ResponseEntity<>(doctorService.getAllDoctor(),HttpStatusCode.valueOf(200));
    }

    @PostMapping
    public  ResponseEntity<DoctorOutputDto> addDoctor(@RequestBody DoctorInputDto doctorInputDto){
        return  new ResponseEntity<>(doctorService.addDoctor(doctorInputDto),HttpStatusCode.valueOf(201));
    }
    @PutMapping
    public ResponseEntity<DoctorOutputDto> updateDoctor(@PathVariable Long id,@RequestBody DoctorInputDto doctorInputDto){
        return  new ResponseEntity<>(doctorService.updateDoctor(id, doctorInputDto),HttpStatusCode.valueOf(200));
    }
    @DeleteMapping
    public  ResponseEntity<String> removeDoctor(@PathVariable Long id){
        return  new ResponseEntity<>(doctorService.removeDoctor(id),HttpStatusCode.valueOf(200));
    }

}
