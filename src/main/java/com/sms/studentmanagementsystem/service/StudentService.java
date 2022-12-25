package com.sms.studentmanagementsystem.service;

import java.util.List;
import java.util.function.LongFunction;

import org.hibernate.engine.jdbc.connections.spi.AbstractDataSourceBasedMultiTenantConnectionProviderImpl;

import com.sms.studentmanagementsystem.entity.Student;

public interface StudentService {
		List<Student> getAllStudents();
		
		Student saveStudent(Student student);
		
		Student getStudentById(Long id);
		Student updateStudent(Student student);
		
		void deleteStudentById(Long id);
 }
