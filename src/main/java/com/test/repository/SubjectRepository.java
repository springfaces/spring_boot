package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer>{

}
