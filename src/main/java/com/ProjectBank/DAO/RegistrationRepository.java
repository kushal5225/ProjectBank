package com.ProjectBank.DAO;

import javax.servlet.Registration;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjectBank.DAOModel.registrationDao;

public interface RegistrationRepository extends JpaRepository<registrationDao, Integer>{

	static Registration saveAll(Registration registration) {
		// TODO Auto-generated method stub
		return null;
	}

}
