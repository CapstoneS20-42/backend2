package com.example.capstone;

import javax.persistence.*;

public class User {
	
	private String ruid;

	private String netID;

	private String username;

	private String lastName;

	private String firstName;

	private int classYear;

	private String GradMonth;

	private int curr;

	private String option;

	private int CGPA;

	private int TGPA;

	private String gender;

	private String emailAddr;

	private String password;

	private int isActive;

	private String roles;

	/*
	 * @Autowired JdbcTemplate jdbc;
	 * 
	 * public List<String> getAllUsers() { List<String> users = new ArrayList<>();
	 * users.addAll(jdbc.
	 * queryForList("SELECT RUID FROM capstonedb.student_data LIMIT 2;",
	 * String.class)); return users; }
	 */
	
	public String getnetID() {
		return netID;
	}

	public void setNetID(String NetID) {
		this.netID = NetID;
	}
	public String getEmailAddr() {
		return emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getTGPA() {
		return TGPA;
	}

	public void setTGPA(int tGPA) {
		this.TGPA = tGPA;
	}

	public int getCGPA() {
		return CGPA;
	}

	public void setCGPA(int cGPA) {
		this.CGPA = cGPA;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public int getCurr() {
		return curr;
	}

	public void setCurr(int curr) {
		this.curr = curr;
	}

	public String getGradMonth() {
		return GradMonth;
	}

	public void setGradMonth(String gradMonth) {
		this.GradMonth = gradMonth;
	}

	public int getClassYear() {
		return classYear;
	}

	public void setClassYear(int classYear) {
		this.classYear = classYear;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRuid() {
		return ruid;
	}

	public void setRuid(String ruid) {
		this.ruid = ruid;
	}

	public String getUsername() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public int isActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "NetID is: " + this.getUsername() + " and password is: " + this.getPassword();
	}


}