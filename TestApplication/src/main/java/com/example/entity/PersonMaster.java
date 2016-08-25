package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="person_master")

public class PersonMaster {
	@Id
	@GeneratedValue
	@Column(name="person_id")
	private Integer personId;

	@Column(name="family_name")
	private String familyName;

	@Column(name="first_name")
	private String firstName;

	@Column(name="age")
	private Integer age;

	@Column(name="validity")
	private Boolean validity;

	public PersonMaster() {
		super();
	}

	public PersonMaster(Integer personId
			, String familyName, String firstName
			, Integer age, Boolean validity){
		super();
		this.personId = personId;
		this.familyName = familyName;
		this.firstName = firstName;
		this.age = age;
		this.validity = validity;
	}

	public void setPersonId (Integer personId){
		this.personId = personId;
	}

	public Integer getPersonId (){
		return this.personId;
	}

	public void setFamilyName (String familyName){
		this.familyName = familyName;
	}

	public String getFamilyName (){
		return this.familyName;
	}

	public void setFirstName (String firstName){
		this.firstName = firstName;
	}

	public String getFirstName (){
		return this.firstName;
	}

	public void setAge (Integer age){
		this.age = age;
	}

	public Integer getAge (){
		return this.age;
	}

	public void setValidity (Boolean validity){
		this.validity = validity;
	}

	public Boolean getValidity (){
		return this.validity;
	}
}