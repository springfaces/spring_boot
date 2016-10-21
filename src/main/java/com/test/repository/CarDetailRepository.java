package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.model.CarDetail;

public interface CarDetailRepository extends JpaRepository<CarDetail, Integer> {

}
