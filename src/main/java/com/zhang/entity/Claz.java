package com.zhang.entity;

import java.io.Serializable;
import java.util.Date;

public class Claz implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String clazId;
	private String clazName;
	private String clazNo;
	private Date beginDate;
	private Date endDate;
	private int total;
	public String getClazId() {
		return clazId;
	}
	public void setClazId(String clazId) {
		this.clazId = clazId;
	}
	public String getClazName() {
		return clazName;
	}
	public void setClazName(String clazName) {
		this.clazName = clazName;
	}
	public String getClazNo() {
		return clazNo;
	}
	public void setClazNo(String clazNo) {
		this.clazNo = clazNo;
	}
	public Date getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}

	
	
}
