package com.zhang.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.common.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;

public class Student extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String stuId;
	private String stuNo;
	private String stuName;
	private String stuSex;
	private Date stuBirth;
	private Claz claz;
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuSex() {
		return stuSex;
	}
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public Date getStuBirth() {
		return stuBirth;
	}
	public void setStuBirth(Date stuBirth) {
		this.stuBirth = stuBirth;
	}
	public Claz getClaz() {
		return claz;
	}
	public void setClaz(Claz claz) {
		this.claz = claz;
	}
	
	
}
