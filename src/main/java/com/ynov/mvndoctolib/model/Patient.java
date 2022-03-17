package com.ynov.mvndoctolib.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Patient")
public class Patient implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String name;
	private int age;
	private List<Pathologie> pathoList;
	
	public String getId() {
		return id;
	}
	public void setId(String _id) {
		this.id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String _name) {
		this.name = _name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int _age) {
		this.age = _age;
	}
	public List<Pathologie> getPathoList() {
		return pathoList;
	}
	public void setPathoList(List<Pathologie> _pathoList) {
		this.pathoList = _pathoList;
	}
	
	public Patient() {};
	public Patient(String _name, int _age) {
		this.name = _name;
		this.age = _age;
	}

}
