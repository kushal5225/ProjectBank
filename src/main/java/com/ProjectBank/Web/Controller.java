package com.ProjectBank.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjectBank.DAO.RegistrationRepository;
import com.ProjectBank.DAOModel.registrationDao;

@RestController
@RequestMapping("/customer")
public class Controller {
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	@PostMapping("/create")
	public registrationDao registration(@RequestBody registrationDao rDao) {
		return registrationRepository.save(rDao);
		
		
	}

}
