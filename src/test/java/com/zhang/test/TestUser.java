package com.zhang.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhang.entity.Student;
import com.zhang.service.StudentService;

public class TestUser extends BaseTest{

	@Autowired
	StudentService ss; 
	
	@Test
	public void testUsr(){
		
		List<Student> stus = ss.findList(new Student());
		
		System.out.println(stus.size());
		
	}
}
