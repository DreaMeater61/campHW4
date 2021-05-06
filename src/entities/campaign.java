package entities;

import abstracts.entity;

public class campaign implements entity{
	private String name;
	private int discount;
	private int id;
	
	
	public campaign(String name, int discount, int id) {
		this.name = name;
		this.discount = discount;
		this.id = id;
	}
	
	public campaign() {
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
}