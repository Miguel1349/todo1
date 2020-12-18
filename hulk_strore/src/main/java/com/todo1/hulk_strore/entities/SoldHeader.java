package com.todo1.hulk_strore.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class SoldHeader {
	
	@Id
	@GeneratedValue
	private long id;
	
	private Date date;
	
	private long idUser;
	
	@OneToOne
	private SoldDetail soldDetail;
	
	public SoldHeader() { }
	
	public SoldHeader(Date date, long idUser) {
		this.date = date;
		this.idUser = idUser;
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

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	
}
