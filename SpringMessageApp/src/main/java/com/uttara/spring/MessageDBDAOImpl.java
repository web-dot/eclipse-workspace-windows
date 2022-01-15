package com.uttara.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MessageDBDAOImpl implements MessageDAO {

	@Autowired
	MessageDAO dao;
	
	public MessageDBDAOImpl() {
		System.out.println("in MDBDAOImpl no-arg constr");
	}
	@Override
	public String getAJoke() {
		System.out.println("in MDBDAOImpl -> getAJokeFromDb()");
		return "One day, obbanu iddanu...";
	}

}
