package com.karun.DemoHib;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student 
{
	@Id
	int sno;
	String sname;
	float savg;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getSavg() {
		return savg;
	}
	public void setSavg(float savg) {
		this.savg = savg;
	}
	

}
