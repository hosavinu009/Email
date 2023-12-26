package com.Email.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Email.Entity.ExcelEn;


public interface ExcelRepository extends JpaRepository<ExcelEn, Serializable>{

}
