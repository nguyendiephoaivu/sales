package com.sales.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import net.karneim.pojobuilder.GeneratePojoBuilder;

@GeneratePojoBuilder
@Entity
public class Teacher {

	private long id;
	private String name;
	private String study;
	private Set<Student> students;
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column
	public String getStudy() {
		return study;
	}
	public void setStudy(String study) {
		this.study = study;
	}
	@OneToMany(cascade=CascadeType.ALL)
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
}
