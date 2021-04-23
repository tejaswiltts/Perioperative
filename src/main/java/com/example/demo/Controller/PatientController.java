package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.PatientService;
import com.example.demo.model.Patient;  
@RestController
public class PatientController {
	@Autowired  
	PatientService patientService;  

@GetMapping("/patient")  
private List<Patient> getAllPatient()   
{  
return patientService.getAllPatient();  
}
@GetMapping("/patient/{patient_id}")  
private Patient getPatient(@PathVariable("patient_id") int patient_id)   
{  
return patientService.getPatientById(patient_id);  
}  
@DeleteMapping("/patient/{patient_id}")  
private void deletePatient(@PathVariable("patient_id") int patient_id)   
{  
patientService.delete(patient_id);  
}  
@PostMapping("/patient")  
private int savePatient(@RequestBody Patient patient)   
{  
patientService.saveOrUpdate(patient);  
return patient.getPatient_id();  
} 
@PutMapping("/patient")  
private Patient update(@RequestBody Patient patient)   
{  
patientService.saveOrUpdate(patient);  
return patient;  
}
}
