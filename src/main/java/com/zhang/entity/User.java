package com.zhang.entity;

import java.util.Date;
import java.util.List;

import com.common.base.BaseEntity;
import com.google.common.collect.Lists;

public class User extends BaseEntity<User>{

	/**
	 * UID
	 */
	private static final long serialVersionUID = 1L;

	private String userid;
	private String nickName;
	private String userNo;
	private String fingerPrint;
	private String gender;
	private Date birthday;
	private String password;
	private String email;
	private String idcardNo;
	private String realName;
	private String mobilePhone;
	private String telphone;
	private String fax;
	private String bankNo;
	private String qq;
	private String wechat;
	private String defaultAddr;
	
	private List<Role> roles = Lists.newArrayList();
	
	
	
	public User() {
	}



	public String getUserid() {
		return userid;
	}



	public void setUserid(String userid) {
		this.userid = userid;
	}



	public String getNickName() {
		return nickName;
	}



	public void setNickName(String nickName) {
		this.nickName = nickName;
	}



	public String getUserNo() {
		return userNo;
	}



	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}



	public String getFingerPrint() {
		return fingerPrint;
	}



	public void setFingerPrint(String fingerPrint) {
		this.fingerPrint = fingerPrint;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public Date getBirthday() {
		return birthday;
	}



	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getIdcardNo() {
		return idcardNo;
	}



	public void setIdcardNo(String idcardNo) {
		this.idcardNo = idcardNo;
	}



	public String getRealName() {
		return realName;
	}



	public void setRealName(String realName) {
		this.realName = realName;
	}



	public String getMobilePhone() {
		return mobilePhone;
	}



	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}



	public String getTelphone() {
		return telphone;
	}



	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}



	public String getFax() {
		return fax;
	}



	public void setFax(String fax) {
		this.fax = fax;
	}



	public String getBankNo() {
		return bankNo;
	}



	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}



	public String getQq() {
		return qq;
	}



	public void setQq(String qq) {
		this.qq = qq;
	}



	public String getWechat() {
		return wechat;
	}



	public void setWechat(String wechat) {
		this.wechat = wechat;
	}



	public String getDefaultAddr() {
		return defaultAddr;
	}



	public void setDefaultAddr(String defaultAddr) {
		this.defaultAddr = defaultAddr;
	}



	public List<Role> getRoles() {
		return roles;
	}



	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	
}
