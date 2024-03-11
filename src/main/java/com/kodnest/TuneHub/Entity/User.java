package com.kodnest.TuneHub.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@GeneratedValue(strategy=GenerationType.UUID)
	@Id
	String Userid;
	
	String Username;
	String email;
	String Password;
	String gender;
	String role;
	String address;
	boolean ispremium;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userid, String username, String email, String password, String gender, String role,
			String address, boolean ispremium) {
		super();
		this.Userid = userid;
		this.Username = username;
		this.email = email;
		this.Password = password;
		this.gender = gender;
		this.role = role;
		this.address = address;
		this.ispremium = ispremium;
	}
	@Override
	public String toString() {
		return "User [Userid=" + Userid + ", Username=" + Username + ", email=" + email + ", Password=" + Password
				+ ", gender=" + gender + ", role=" + role + ", address=" + address + ", ispremium=" + ispremium + "]";
	}
	public String getUserid() {
		return Userid;
	}
	public void setUserid(String userid) {
		Userid = userid;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isIspremium() {
		return ispremium;
	}
	public void setIspremium(boolean ispremium) {
		this.ispremium = ispremium;
	}
		
}
