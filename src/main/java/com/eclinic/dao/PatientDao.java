/**
 * 
 */
package com.eclinic.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eclinic.domain.Patient;

/**
 * @author ashraf
 *
 */
@Repository
@Transactional
public interface PatientDao extends CrudRepository<Patient, Long> {
	
	

}
