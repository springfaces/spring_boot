package com.test.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student {
	
	private int id;
	private String name;
	private Set<Subject> subject;
	
	
	public Student() {
		
	}
	
	public Student(String name, Set<Subject> subject) {
		this.name = name;
		this.subject = subject;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="student_subjects", joinColumns = @JoinColumn(name="student_id", referencedColumnName="id"),
				inverseJoinColumns = @JoinColumn(name="subject_id", referencedColumnName="id"))
	public Set<Subject> getSubject() {
		return subject;
	}

	public void setSubject(Set<Subject> subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subject=" + subject + "]";
	}
	
	
}
