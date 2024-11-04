package com.cdac.acts;

public class Fruit {
	private String name;
	private String color;
	private int price;
	private int quality;
	
	public Fruit() {
		this.name="";
		this.color="";
		this.price=0;
		this.quality=0;
	}
	public Fruit(String name, String color, int price, int quality) {
		this.name=name;
		this.color=color;
		this.price=price;
		this.quality=quality;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", price=" + price + ", quality=" + quality + "]";
	}
	

}
