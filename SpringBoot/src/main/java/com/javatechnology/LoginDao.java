package com.javatechnology;

//@Repository
public interface LoginDao {
	Login save(Login login);
	Login findByUsername(String username);
	
}
