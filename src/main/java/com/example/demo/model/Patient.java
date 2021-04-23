package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table
public class Patient {
	@Id  
	private int patient_id;
	@Column 
	private String patient_name;
	@Column 
	private String contact;
	@Column 
	private int bp;
	@Column 
	private int age;
	@Column 
	private String illness;
	@Column 
	private int weight;
	
	
	@ManyToOne
	@JoinColumn(name="emp_id")
	private Employee doctor_assigned;


	public int getPatient_id() {
		return patient_id;
	}


	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}


	public String getPatient_name() {
		return patient_name;
	}


	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public int getBp() {
		return bp;
	}


	public void setBp(int bp) {
		this.bp = bp;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getIllness() {
		return illness;
	}


	public void setIllness(String illness) {
		this.illness = illness;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public Employee getDoctor_assigned() {
		return doctor_assigned;
	}


	public void setDoctor_assigned(Employee doctor_assigned) {
		this.doctor_assigned = doctor_assigned;
	}


	public Patient(int patient_id, String patient_name, String contact, int bp, int age, String illness, int weight,
			Employee doctor_assigned) {
		super();
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.contact = contact;
		this.bp = bp;
		this.age = age;
		this.illness = illness;
		this.weight = weight;
		this.doctor_assigned = doctor_assigned;
	}


	@Override
	public String toString() {
		return "Patient [patient_id=" + patient_id + ", patient_name=" + patient_name + ", contact=" + contact + ", bp="
				+ bp + ", age=" + age + ", illness=" + illness + ", weight=" + weight + ", doctor_assigned="
				+ doctor_assigned + "]";
	}


	public Patient() {
		super();
	}


	
	
	
	
	
}