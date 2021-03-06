package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
//import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="phone_list")

public class PersonPhoneSearch {
	@Id
	@GeneratedValue
	@Column(name="list_id")
	private Integer listId;

	@Column(name="person_id")
	private Integer personId;

	@Column(name="phone_number")
	private String phoneNumber;

	@Column(name="mobile_flag")
	private Boolean mobileFlag;

	@Column(name="validity")
	private Boolean validity;

	@OneToOne
	@JoinColumn(name="person_id", insertable=false, updatable=false)
	private PersonMaster personMaster;


	public PersonPhoneSearch() {
		super();
	}

	public PersonPhoneSearch(Integer listId
			, Integer personId, String phoneNumber
			, Boolean mobileFlag, Boolean validity){
		super();
		this.listId = listId;
		this.personId = personId;
		this.phoneNumber = phoneNumber;
		this.mobileFlag = mobileFlag;
		this.validity = validity;
	}

	public void setListId (Integer listId){
		this.listId = listId;
	}

	public Integer getListId (){
		return this.listId;
	}

	public void setPersonId (Integer personId){
		this.personId = personId;
	}

	public Integer getPersonId (){
		return this.personId;
	}

	public void setPhoneNumber (String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber (){
		return this.phoneNumber;
	}

	public void setMobileFlag (Boolean mobileFlag){
		this.mobileFlag = mobileFlag;
	}

	public Boolean getMobileFlag (){
		return this.mobileFlag;
	}

	public void setValidity (Boolean validity){
		this.validity = validity;
	}

	public Boolean getValidity (){
		return this.validity;
	}

	public void setPersonMaster (PersonMaster personMaster){
		this.personMaster = personMaster;
	}

	public PersonMaster getPersonMaster (){
		return this.personMaster;
	}
}