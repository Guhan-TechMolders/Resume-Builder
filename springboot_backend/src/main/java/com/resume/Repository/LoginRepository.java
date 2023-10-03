package com.resume.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resume.Model.Login;

public interface LoginRepository extends JpaRepository<Login,Long> {
public Login getByUserEmail(String email);
public Login getByPhoneNumber(String phoneNumber);
}
