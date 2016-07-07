/**
 * 
 */
package com.eclinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eclinic.dao.PatientDao;
import com.eclinic.domain.Patient;

/**
 * @author ashraf
 *
 */
@Service
public class UserService {
	
	@Autowired
	private PatientDao patientDao;
	
	public List<Patient> getAllPatients() {
		return (List<Patient>) patientDao.findAll();
	}

}
