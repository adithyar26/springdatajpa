package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repositories.CompanyDAO;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CompanyController {
	
	private CompanyDAO companyDAO;
	
	
	

}
