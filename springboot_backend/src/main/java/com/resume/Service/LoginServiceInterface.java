package com.resume.Service;

import java.util.List;
import java.util.Optional;

import com.resume.Model.Login;

public interface LoginServiceInterface {
public String addUser(Login user);
public List<Login> getAllUser();
public Optional<Login> getUserById(long id);
public Login getByEmail(String email);
public Login getByPhoneNumber(String phoneNumber);
}
