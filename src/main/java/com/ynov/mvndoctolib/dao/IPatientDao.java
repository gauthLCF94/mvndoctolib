package com.ynov.mvndoctolib.dao;

import java.util.List;

import com.ynov.mvndoctolib.model.Patient;

public interface IPatientDao {
	
	// Create
	public boolean SavePatient(Patient _p);
	// Read
	public List<Patient> GetPatient();
	public Patient GetPatientbyId(int _id);
	// Update
	public Patient UpdatePatientById(int _id, String _name);
	public Patient UpdatePatientById(int _id, int _age);
	public Patient UpdatePatientById(int _id, String _name, int _age);
	//Delete
	public Patient DeletePatientById(int _id);
}
