package com.spring.service;

import java.lang.annotation.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.MessageDAO;

@Service
public class MessageService implements MsgService {
	
	@Autowired
	MessageDAO dao;

	public MessageService() {
		System.out.println("in MSImpl no-arg constr");
	}
	
	public String getJoke() {
		System.out.println("in MSImpl->getJoke()");
		return null;
	}

	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	public String value() {
		// TODO Auto-generated method stub
		return null;
	}

}
