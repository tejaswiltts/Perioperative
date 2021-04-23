package com.example.demo.Service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.PatientRepo;
import com.example.demo.model.Patient;

;

@Service  
public class PatientService {
	@Autowired  
	PatientRepo patientRepository;  
	public List<Patient> getAllPatient()   
	{  
	List<Patient> patient = new ArrayList<Patient>();  
	patientRepository.findAll().forEach(patient1 -> patient.add(patient1));  
	return patient;  
	}
	public Patient getPatientById(int patient_id)   
	{  
	return patientRepository.findById(patient_id).get();  
	}  
	public void saveOrUpdate(Patient patient)   
	{  
	patientRepository.save(patient);  
	}  
	public void delete(int patient_id)   
	{  
	patientRepository.deleteById(patient_id);  
	} 
	public void update(Patient patient, int patient_id)   
	{  
	patientRepository.save(patient);  
	} 
}
