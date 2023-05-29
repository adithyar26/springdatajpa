package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Company;

@Repository
public interface CompanyDAO extends CrudRepository<Company, Long>{

}
