package com.javatechnology;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl  implements LoginDao{
	@Autowired
	private LoginRepository repository;
	
	@Override
	public Login save(Login login) {
		
		return repository.save(login);	
		//return null;
	}

	@Override
	public Login findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
