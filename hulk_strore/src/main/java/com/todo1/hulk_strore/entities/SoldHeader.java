package com.todo1.hulk_strore.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SoldHeader {
	
	@Id
	@GeneratedValue
	private long id;
	
	private Date date;
	
	public SoldHeader() { }
	
	public SoldHeader(Date date) {
		this.date = date;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
}
