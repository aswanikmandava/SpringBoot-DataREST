package com.mandava.springboot.tennisplayerspringdatarest;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String nationality;
	@JsonFormat(pattern = "MM/dd/yyyy")
	private Date birthDate;
	private int titles;
	public Player() {
		super();
	}
	public Player(int id, String name, String nationality, Date birthDate, int titles) {
		super();
		this.id = id;
		this.name = name;
		this.nationality = nationality;
		this.birthDate = birthDate;
		this.titles = titles;
	}
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
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public int getTitles() {
		return titles;
	}
	public void setTitles(int titles) {
		this.titles = titles;
	}
	
	

}
