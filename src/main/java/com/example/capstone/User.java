package com.example.capstone;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.persistence.*;

@Entity
@Table(name = "StudentData")
public class User {
	
	private String RUID;
	private String NET_ID;
	private String NAME_LAST;
	private String NAME_FIRST;
	private int CLASS;
	private String Grad_Mth;
	private int CURR;
	private String OPTION;
	private double CGPA;
	private double TGPA;
	private String GENDER;
	private String EMAIL_ADDR;
	private String Password;
	private boolean isActive;
	private String roles;

	@Autowired
	JdbcTemplate jdbc;

	public List<String> getAllUsers() {
		List<String> users = new ArrayList<>();
		users.addAll(jdbc.queryForList("SELECT RUID FROM capstonedb.studentData LIMIT 2;", String.class));
		return users;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password = password;
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
		return CLASS;
	}

	public void setCLASS(int cLASS) {
		this.CLASS = cLASS;
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
		return OPTION;
	}

	public void setOPTION(String oPTION) {
		this.OPTION = oPTION;
	}

	public double getCGPA() {
		return CGPA;
	}

	public void setCGPA(double cGPA) {
		this.CGPA = cGPA;
	}

	public double getTGPA() {
		return TGPA;
	}

	public void setTGPA(double tGPA) {
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