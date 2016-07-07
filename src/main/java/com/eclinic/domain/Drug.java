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
 * Drug generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "drug", catalog = "eclinic")
public class Drug implements Serializable {

	private long id;
	private String name;
	private String tradeName;
	private Set<PrescriptionDrug> prescriptionDrugs = new HashSet<PrescriptionDrug>(0);

	public Drug() {
	}

	public Drug(String name, String tradeName) {
		this.name = name;
		this.tradeName = tradeName;
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

	@Column(name = "trade_name")
	public String getTradeName() {
		return this.tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "drug")
	public Set<PrescriptionDrug> getPrescriptionDrugs() {
		return this.prescriptionDrugs;
	}

	public void setPrescriptionDrugs(Set<PrescriptionDrug> prescriptionDrugs) {
		this.prescriptionDrugs = prescriptionDrugs;
	}

	@Override
	public String toString() {
		return "Drug [id=" + id + ", name=" + name + ", tradeName=" + tradeName + ", prescriptionDrugs="
				+ prescriptionDrugs + "]";
	}

}