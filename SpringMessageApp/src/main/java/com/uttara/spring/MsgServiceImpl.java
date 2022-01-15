package com.uttara.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MsgServiceImpl implements MsgService {

	@Autowired
	MessageDAO dao;
	
	public MsgServiceImpl() {
		System.out.println("in MSImpl no-arg constr");
	}
	
	@Override
	public String getJoke() {
		System.out.println("in MSImpl -> getJoke()");
		
		return dao.getAJoke();
	}

}
