package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Value;

@Entity
@Table(name="company")
@Value
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	Long companyId;
	
	String companyName;
	
	Long companyStrength;

}
