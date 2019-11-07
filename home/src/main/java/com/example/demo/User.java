package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class User {

	private String username;
	private String password;
	private String name;
	private String email;
	private String pssword;
	private int phone;
	
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getPssword() 
	{
		return pssword;
	}
	public void setPssword(String pssword) 
	{
		this.pssword = pssword;
	}
	public int getPhone() 
	{
		return phone;
	}
	public void setPhone(int phone) 
	{
		this.phone = phone;
	}
}
