package com.ynov.mvndoctolib.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ynov.mvndoctolib.model.Patient;

@RestController
public class PatientController {
static List<Patient> myStaticPatientList = new ArrayList<Patient>();
	
	static {
		Patient p1 = new Patient("toto", 12);
		Patient p2 = new Patient("tata", 36);
		Patient p3 = new Patient("pepe", 74);
		Patient p4 = new Patient("meme", 69);
		
		Patient p5 = new Patient();
		p5.setName("neymar");
		p5.setAge(28);

		p1.setId("0");
		p2.setId("1");
		p3.setId("2");
		p4.setId("3");
		p5.setId("4");
	
		
		myStaticPatientList.add(p1);
		myStaticPatientList.add(p2);
		myStaticPatientList.add(p3);
		myStaticPatientList.add(p4);
		myStaticPatientList.add(p5);
	}
	
	@GetMapping("/patient")
    public List<Patient> getPatient() {
        return myStaticPatientList;
    }
	
	@GetMapping("/patient/{_id}")
	public Patient getPatient(@PathVariable String _id)
	{
		for (Patient p : myStaticPatientList)
		{
			if (p.getId() == _id)
				return p;
		}
		return null;
	}
}
