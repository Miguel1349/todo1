package com.todo1.hulk_strore.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class SoldDetail {
	
	@Id
	@GeneratedValue
	private long id;
	
	private long quantity;
	private double value;
	
	@OneToMany(mappedBy = "soldDetail", cascade = CascadeType.ALL)
	List<Item> lstItems;
	
	@OneToOne
	public SoldHeader soldHeader;
	
	public SoldDetail() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public List<Item> getLstItems() {
		return lstItems;
	}

	public void setLstItems(List<Item> lstItems) {
		this.lstItems = lstItems;
	}

	public SoldHeader getSoldHeader() {
		return soldHeader;
	}

	public void setSoldHeader(SoldHeader soldHeader) {
		this.soldHeader = soldHeader;
	}

}
