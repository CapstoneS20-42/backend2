package com.example.capstone;

//import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Register {
	
	@Autowired
	JdbcTemplate jdbc;

	public Boolean registerUser(String ruid) {
		//Get RUID from Frontend
		ruid = "0000";
		//Check Capstone Database
		Boolean capstoneCheck = checkStudentDataDB(ruid);
		if (!capstoneCheck){
			return false; //User does not exist in Capstone DB
		}

		//Check Student Database
		Boolean studentCheck = checkStudentDB(ruid);
		if (!studentCheck){
			return true; //New user in student database
		}
		else{
			return false; //User already exists in database
		}

		//If eligible to register:
		

	}

	public Boolean checkStudentDataDB(String ruid){
		boolean ruidCheck = false;
		ruidCheck = jdbc.queryForObject("SELECT RUID FROM capstonedb.studentData WHERE RUID = " + ruid, Boolean.class);
		System.out.println("Checking student data: " + ruidCheck);
		//also need to check if they are eligible to register
		return ruidCheck;
	}

	public Boolean checkStudentDB(String ruid){
		boolean ruidCheck = false;
		ruidCheck = jdbc.queryForObject("SELECT RUID FROM capstonedb.students WHERE RUID = " + ruid, Boolean.class);
        System.out.println("Checking studentdb: " +  ruidCheck);
		return ruidCheck;
	}

}