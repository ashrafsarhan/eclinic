/**
 * 
 */
package com.eclinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eclinic.domain.Patient;
import com.eclinic.service.UserService;

/**
 * @author ashraf
 *
 */

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/patients")
    public List<Patient> greeting() {
        return userService.getAllPatients();
    }

}
