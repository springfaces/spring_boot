package com.test.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Subject {

		private int id;
		private String name;
		private Set<Student> student;
		
		
		public Subject() {
			
		}
		
		public Subject(String name, Set<Student> student) {
			this.name = name;
			this.student = student;
		}

		public Subject(String name) {
			this.name = name;
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
		
		@ManyToMany(mappedBy="subject")
		public Set<Student> getStudent() {
			return student;
		}

		public void setStudent(Set<Student> student) {
			this.student = student;
		}

		@Override
		public String toString() {
			return "Subject [id=" + id + ", name=" + name + ", student=" + student + "]";
		}
		
		
}
