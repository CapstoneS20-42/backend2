package com.example.capstone;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.persistence.*;

@Entity
@Table(name = "student_data")
public class User {
	
	@Column(name="RUID") 
	private String RUID;

	@Id
	@Column(name="NET_ID") 
	private String NET_ID;

	@Column(name="userName")
	private String username;

	@Column(name="NAME_LAST") 
	private String NAME_LAST;

	@Column(name="NAME_FIRST") 
	private String NAME_FIRST;

	@Column(name="Class_Year") 
	private int Class_Year;

	@Column(name="Grad_Mth") 
	private String Grad_Mth;

	@Column(name="CURR") 
	private int CURR;

	@Column(name="OPT") 
	private String OPT;

	@Column(name="CGPA") 
	private int CGPA;

	@Column(name="TGPA") 
	private int TGPA;

	@Column(name="GENDER") 
	private String GENDER;

	@Column(name="EMAIL_ADDR") 
	private String EMAIL_ADDR;

	@Column(name="pass") 
	private String pass;

	@Column(name="isActive") 
	private int isActive;

	@Column(name="roles") 
	private String roles;

	/*
	@Autowired
	JdbcTemplate jdbc;

	public List<String> getAllUsers() {
		List<String> users = new ArrayList<>();
		users.addAll(jdbc.queryForList("SELECT RUID FROM capstonedb.student_data LIMIT 2;", String.class));
		return users;
	}
	*/

	public User(String username){
		this.username = username;
	}

	public User(String username, String pass) {
		this.username = username;
		this.pass = pass;
	}
	public String getUserName() {
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
		return pass;
	}

	public void setPassword(String password) {
		this.pass = password;
	}

	public String getRUID() {
		return RUID;
	}

	public void setRUID(String rUID) {
		this.RUID = rUID;
	}

	public String getNET_ID() {
		return NET_ID;
	}

	public void setNET_ID(String nET_ID) {
		this.NET_ID = nET_ID;
	}

	public String getNAME_LAST() {
		return NAME_LAST;
	}

	public void setNAME_LAST(String nAME_LAST) {
		this.NAME_LAST = nAME_LAST;
	}

	public String getNAME_FIRST() {
		return NAME_FIRST;
	}

	public void setNAME_FIRST(String nAME_FIRST) {
		this.NAME_FIRST = nAME_FIRST;
	}

	public int getCLASS() {
		return Class_Year;
	}

	public void setCLASS(int cLASS) {
		this.Class_Year = cLASS;
	}

	public String getGrad_Mth() {
		return Grad_Mth;
	}

	public void setGrad_Mth(String grad_Mth) {
		this.Grad_Mth = grad_Mth;
	}

	public int getCURR() {
		return CURR;
	}

	public void setCURR(int cURR) {
		this.CURR = cURR;
	}

	public String getOPTION() {
		return OPT;
	}

	public void setOPTION(String oPTION) {
		this.OPT = oPTION;
	}

	public double getCGPA() {
		return CGPA;
	}

	public void setCGPA(int cGPA) {
		this.CGPA = cGPA;
	}

	public double getTGPA() {
		return TGPA;
	}

	public void setTGPA(int tGPA) {
		this.TGPA = tGPA;
	}

	public String getGENDER() {
		return GENDER;
	}

	public void setGENDER(String gENDER) {
		this.GENDER = gENDER;
	}

	public String getEMAIL_ADDR() {
		return EMAIL_ADDR;
	}

	public void setEMAIL_ADDR(String eMAIL_ADDR) {
		this.EMAIL_ADDR = eMAIL_ADDR;
	}

}