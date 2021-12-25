package com.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Teacher_main")
public class Teacher 
{
	public Teacher()
	{}
	
	@Id
	//@SequenceGenerator(name="teacher_sequence",sequenceName = "teacher_sequence",allocationSize = 1)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "teacher_sequence")
	private int tid;
	private String tName;
	private String mobile;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public Teacher(int tid, String tName, String mobile) {
		super();
		this.tid = tid;
		this.tName = tName;
		this.mobile = mobile;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
