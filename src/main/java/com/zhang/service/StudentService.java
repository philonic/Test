package com.zhang.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.common.base.BaseService;
import com.zhang.dao.StudentDao;
import com.zhang.entity.Student;


@Service
@Transactional(readOnly = true)
public class StudentService extends BaseService<StudentDao, Student>{

	
	@Transactional(readOnly = false)
	public int getCalzTotalStudent(Student s){
		return dao.findList(s).size();
	}
	
}
