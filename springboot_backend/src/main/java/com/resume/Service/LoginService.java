package com.resume.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.resume.Model.Login;
import com.resume.Repository.LoginRepository;

public class LoginService implements LoginServiceInterface {

	@Autowired
	private LoginRepository loginRepository;
	@Override
	public String addUser(Login user) {
		loginRepository.save(user);
		return "Successfully saved";
	}

	@Override
	public List<Login> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Login> getUserById(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Login getByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}


}
