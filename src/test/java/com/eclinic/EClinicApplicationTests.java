package com.eclinic;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.eclinic.dao.PatientDao;
import com.eclinic.domain.Patient;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EClinicApplication.class)
@WebAppConfiguration
@Transactional
public class EClinicApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(EClinicApplicationTests.class);

	@Autowired
	private PatientDao patientDao;

	@Test
	public void contextLoads() {

		Patient patient = new Patient("xyz", 1, "abc", "123456");
		Patient savedPatient = patientDao.save(patient);
		logger.info("Saved Patient: {}", savedPatient);
		assertNotNull("Error while saving patient", savedPatient);

	}

}
