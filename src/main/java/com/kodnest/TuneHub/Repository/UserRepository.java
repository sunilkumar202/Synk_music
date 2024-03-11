package com.kodnest.TuneHub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.TuneHub.Entity.User;

public interface UserRepository extends 
JpaRepository<User,String>{

	public User findByEmail(String email);



}
