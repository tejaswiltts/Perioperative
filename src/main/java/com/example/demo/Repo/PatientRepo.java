package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Patient;


public interface PatientRepo extends CrudRepository<Patient, Integer>  
{ 
}
