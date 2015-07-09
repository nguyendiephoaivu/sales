package com.sales.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sales.service.StudentService;

@Service(value="StudentService")
public class StudentServiceImpl implements StudentService {

	final static Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);
	
	@Resource
	private StudentService studentService;

	@Override
	public String findByTeacherAndName(String json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findDistinctPeopleByNameOrLastname(String json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findByLastnameIgnoreCase(String json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findByLastnameAndNameAllIgnoreCase(String json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findByLastnameOrderByFirstnameAsc(String json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findByLastnameOrderByNameDesc(String json) {
		// TODO Auto-generated method stub
		return null;
	}
}
