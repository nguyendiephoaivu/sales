package com.sales.service;

public interface StudentService {

	String findByTeacherAndName(String json);

	String findDistinctPeopleByNameOrLastname(String json);

	String findByLastnameIgnoreCase(String json);

	String findByLastnameAndNameAllIgnoreCase(String json);

	String findByLastnameOrderByFirstnameAsc(String json);

	String findByLastnameOrderByNameDesc(String json);
}
