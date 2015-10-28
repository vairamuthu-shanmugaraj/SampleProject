package com.github.elizabetht.service;
/*
 * Creating interface for accessing the Student services. 
 */
import com.github.elizabetht.model.Student;

public interface StudentService {
	Student save(Student student);

	boolean findByLogin(String userName, String password);

	boolean findByUserName(String userName);
}
