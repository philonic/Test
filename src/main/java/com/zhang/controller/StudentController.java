package com.zhang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhang.entity.Student;
import com.zhang.service.StudentService;

@Controller
@RequestMapping("/stu")
public class StudentController {

	@Autowired
	StudentService ss;
	
	@ModelAttribute
	public Student get(Student s)
	{
		Student s1 = ss.get(s);
		if(s1 == null)
		{
			s1 = s;
		}
		return s1;
	}
	
	
	@RequestMapping("/setSingle")
	public ModelAndView getas(Student s)
	{
		Student s1 = ss.get(s);
		if(s1 == null)
		{
			s1 = s;
		}
		ModelAndView mav=new ModelAndView("stu/stuInfo");
		mav.addObject("student", s1);
		return mav;
	}
	
	@RequestMapping("/getList")
	public ModelAndView getList(Student s)
	{
		List<Student> lists = ss.findList(s);
		
		ModelAndView mav=new ModelAndView("stu/stuList");
		mav.addObject("list", lists);
		return mav;
	}
	
}
