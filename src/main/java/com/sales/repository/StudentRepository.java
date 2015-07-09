package com.sales.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sales.model.Student;
import com.sales.model.Teacher;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
	List<Student> findByTeacherAndName(Teacher teacher, String name);

	// Enables the distinct flag for the query
	List<Student> findDistinctPeopleByNameOrLastname(String name, String lastname);

	// Enabling ignoring case for an individual property
	List<Student> findByLastnameIgnoreCase(String lastname);

	// Enabling ignoring case for all suitable properties
	List<Student> findByLastnameAndNameAllIgnoreCase(String lastname, String name);

	// Enabling static ORDER BY for a query
	List<Student> findByLastnameOrderByFirstnameAsc(String lastname);

	List<Student> findByLastnameOrderByNameDesc(String lastname);
}
