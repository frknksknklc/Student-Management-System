package com.sms.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms.studentmanagementsystem.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
		 
	
}
