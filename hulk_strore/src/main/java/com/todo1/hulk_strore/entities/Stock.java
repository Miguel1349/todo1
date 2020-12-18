package com.todo1.hulk_strore.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Stock {
	
	@Id
	@GeneratedValue
	private long id;
	
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date dateIn;
	
	private long quantity;
	private String description;
	private Long value;
	
	@ManyToOne
	private Item item;
	
	public Stock() { }
	
	public Stock(Date dateIn, long quantity, String description, long value, Item item) {
		this.dateIn = dateIn;
		this.quantity = quantity;
		this.description = description;
		this.value = value;
		this.item = item;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDateIn() {
		return dateIn;
	}

	public void setDateIn(Date dateIn) {
		this.dateIn = dateIn;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
