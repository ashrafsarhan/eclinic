package com.eclinic.domain;
// Generated Jul 7, 2016 1:08:16 PM by Hibernate Tools 4.3.1

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Patient generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "patient", catalog = "eclinic")
public class Patient implements Serializable {

	private long id;
	private String name;
	private Integer gender;
	private String address;
	private String phone;
	private Set<PatientDisease> patientDiseases = new HashSet<PatientDisease>(0);
	private Set<PatientVisit> patientVisits = new HashSet<PatientVisit>(0);
	
	public Patient() {
	}

	public Patient(String name, Integer gender, String address, String phone) {
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "gender")
	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	@Column(name = "address")
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "phone")
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patient")
	public Set<PatientDisease> getPatientDiseases() {
		return this.patientDiseases;
	}

	public void setPatientDiseases(Set<PatientDisease> patientDiseases) {
		this.patientDiseases = patientDiseases;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patient")
	public Set<PatientVisit> getPatientVisits() {
		return this.patientVisits;
	}

	public void setPatientVisits(Set<PatientVisit> patientVisits) {
		this.patientVisits = patientVisits;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + ", phone="
				+ phone + ", patientDiseases=" + patientDiseases + ", patientVisits=" + patientVisits + "]";
	}

}