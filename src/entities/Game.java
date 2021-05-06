package entities;

import abstracts.entity;

public class Game implements entity{
	private int id;
	private String name;
	private int price;
	
	public Game(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Game() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}