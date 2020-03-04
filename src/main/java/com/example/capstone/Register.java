package com.example.capstone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.apache.commons.lang3.*;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;


/* Register/Login Functionality, need to add authentication
After form submit
1. check netid (done)
2. if netid valid:  (done)
	a. check grad year,  (done)
		1. if valid: register user (step 3) (done)
		2. If false, not eligible (done)
		b. else netid not found (done)
3. Register User: (done)
	a. Create random password and store into db (done)
	b. Send email with netID and temp password (done)
4. login portion:
	a. On first sign in, send to new form with RUID, Temp Password, New password
		1. Update password 
		2. set isActive to true
	b. On non-first sign in, check username + password
		1. Check isActive: if false- then they are logging in with a temp password, 
		redirect to set new password page (step 4a)
		2. If true, login
*/

@Repository
public class Register {
	
	@Autowired
	JdbcTemplate jdbc;

	@Autowired
    private JavaMailSender javaMailSender;

	public String registerUser(String netid) {
		//Get RUID from Frontend
		netid = "0000";
		//Check Capstone Database
		Boolean netID = checkNetID(netid);
		if (!netID){
			return "NetID not found"; //User does not exist in Capstone DB
		}

		Boolean year = checkClass(netid);
		if (!year){
			return "Not eligible for capstone";
		}

		String tempPass = tempPwd();
		String storeTemp = "UPDATE studentData SET Password = ? WHERE NET_ID = ?";
		jdbc.update(storeTemp, tempPass, netid); 
		sendEmail(netid, tempPass);

		return "hello";
		

	}

	public Boolean checkNetID(String netid){
		boolean netidCheck = false;
		netidCheck = jdbc.queryForObject("SELECT NET_ID FROM capstonedb.studentData WHERE NET_ID = " + netid, Boolean.class);
		System.out.println("NetID Exist: " + netidCheck);
		return netidCheck;
	}

	public Boolean checkClass(String netid){
		boolean classCheck = false;
		classCheck = jdbc.queryForObject("SELECT CLASS FROM capstonedb.studentData WHERE NET_ID = " + netid, Boolean.class);
		System.out.println("Class Eligible: " + classCheck);
		return classCheck;
	}

	public String tempPwd(){
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
		String pwd = RandomStringUtils.random( 15, characters );
		System.out.println( pwd );
		return pwd;
	}

	void sendEmail(String netid, String tempPassword) {

		SimpleMailMessage msg = new SimpleMailMessage();
		String email = jdbc.queryForObject("SELECT EMAIL_ADDR FROM capstonedb.studentData WHERE NET_ID = " + netid, String.class);
        msg.setTo(email);
        msg.setSubject("Capstone Login Information");
        msg.setText("Thank you for registering for capstone! Please find your login information below: \nUsername: " + netid + "\nTemporary Password: " + tempPassword);
        javaMailSender.send(msg);

    }



}