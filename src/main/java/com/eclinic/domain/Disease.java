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
 * Disease generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "disease", catalog = "eclinic")
public class Disease implements Serializable {

	private long id;
	private String name;
	private String symptoms;
	private String description;
	private String infection;
	private String chronic;
	private Set<PatientDisease> patientDiseases = new HashSet<PatientDisease>(0);
	
	public Disease() {
	}

	public Disease(String name, String symptoms, String description, String infection, String chronic) {
		this.name = name;
		this.symptoms = symptoms;
		this.description = description;
		this.infection = infection;
		this.chronic = chronic;
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

	@Column(name = "symptoms")
	public String getSymptoms() {
		return this.symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "infection")
	public String getInfection() {
		return this.infection;
	}

	public void setInfection(String infection) {
		this.infection = infection;
	}

	@Column(name = "chronic")
	public String getChronic() {
		return this.chronic;
	}

	public void setChronic(String chronic) {
		this.chronic = chronic;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "disease")
	public Set<PatientDisease> getPatientDiseases() {
		return this.patientDiseases;
	}

	public void setPatientDiseases(Set<PatientDisease> patientDiseases) {
		this.patientDiseases = patientDiseases;
	}

	@Override
	public String toString() {
		return "Disease [id=" + id + ", name=" + name + ", symptoms=" + symptoms + ", description=" + description
				+ ", infection=" + infection + ", chronic=" + chronic + ", patientDiseases=" + patientDiseases + "]";
	}

}
