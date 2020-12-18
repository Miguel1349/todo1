package com.todo1.hulk_strore.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Item")
public class Item {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	private String detail;
	private boolean soldOut;
	
	@OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
	private List<Stock> stock;
	
	@ManyToOne
	private SoldDetail soldDetail;
	
	public Item() { }
	
	public Item(String name, String detail) {
		this.name = name;
		this.detail = detail;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	public boolean isAgotado() {
		return soldOut;
	}

	public void setAgotado(boolean soldOut) {
		this.soldOut = soldOut;
	}
	
	public SoldDetail getSoldDetail() {
		return soldDetail;
	}

	public void setSoldDetail(SoldDetail soldDetail) {
		this.soldDetail = soldDetail;
	}
	
	public List<Stock> getStock() {
		return stock;
	}

	public void setStock(List<Stock> stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return name + ": " + detail;
	}

}
