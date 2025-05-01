package com.rest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Mobile {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
    public Mobile(Integer id, String brand, String model, Double price, Color color) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + ", color=" + color
				+ "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	@Column(length=50)
private String brand;
    @Column(length=50)
private String model;
private Double price;
@Enumerated(EnumType.STRING)
private Color color;
	public Mobile() {
		
	}

}
