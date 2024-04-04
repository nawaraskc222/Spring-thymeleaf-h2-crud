package com.SpringBoot_thymeleaf_7.SpringBoot_thymeleaf_7;

import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
@Table(name = "NawarasTable")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
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
	
	  

	
	

}
