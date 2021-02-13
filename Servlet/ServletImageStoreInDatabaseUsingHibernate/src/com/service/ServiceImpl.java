package com.service;

import com.dao.DaoI;
import com.dao.DaoImpl;
import com.model.Student;

public class ServiceImpl implements SeviceI{

	DaoI d=new DaoImpl();
	
	@Override
	public void addStudentData(Student student) {
	 
		d.addStudentData(student);
		
	}

}
