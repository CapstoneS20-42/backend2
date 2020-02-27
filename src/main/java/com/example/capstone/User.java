package com.example.capstone;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class User {
	
	@Autowired
	JdbcTemplate jdbc;

	public List<String> getAllUsers() {
		List<String> users = new ArrayList<>();
		users.addAll(jdbc.queryForList("SELECT RUID FROM capstonedb.studentData LIMIT 2;", String.class));
		return users;
	}

}