package com.learner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("B1")
public class Course {

	@Value("201")
	private int Cid;
	
	@Value("full stack java Developer")
	private String Cname;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int cid, String cname) {
		super();
		Cid = cid;
		Cname = cname;
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	@Override
	public String toString() {
		return "Course [Cid=" + Cid + ", Cname=" + Cname + "]";
	}
	
	
}
