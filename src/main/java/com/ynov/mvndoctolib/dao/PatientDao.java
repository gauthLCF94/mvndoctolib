package com.ynov.mvndoctolib.dao;

import java.util.List;

import com.ynov.mvndoctolib.model.Patient;

public class PatientDao implements IPatientDao {

	// Todo: Appelle le repositorie de mongo
	// GetAll(); Save();
	// 
	
	@Override
	public List<Patient> GetPatient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient GetPatientbyId(int _id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean SavePatient(Patient _p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Patient UpdatePatientById(int _id, String _name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient UpdatePatientById(int _id, int _age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient UpdatePatientById(int _id, String _name, int _age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient DeletePatientById(int _id) {
		// TODO Auto-generated method stub
		return null;
	}

}
