package com.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class Car {
	
	private int id;
	private String name;
	private CarDetail carDetail;
	
	public Car() {
		
	}
	
	public Car(String name) {
		this.name = name;
	}

	public Car(String name, CarDetail carDetail) {
		this.name = name;
		this.carDetail = carDetail;
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

	@ManyToOne
	@JoinColumn(name="car_detail_id")
	public CarDetail getCarDetail() {
		return carDetail;
	}

	public void setCarDetail(CarDetail carDetail) {
		this.carDetail = carDetail;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", carDetail=" + carDetail + "]";
	}
	
	

}
