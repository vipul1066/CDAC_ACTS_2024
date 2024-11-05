package com.cdac.acts;

public class Fruits {
	private String name;
	private String color;
	private Integer price;
	private Integer quality;
	
	public Fruits() {
		this.name="";
		this.color="";
		this.price=0;
		this.quality=0;
	}
	public Fruits(String name, String color, Integer price, Integer quality) {
		this.name=name;
		this.color=color;
		this.price=price;
		this.quality=quality;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(Integer quality) {
		this.quality = quality;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", price=" + price + ", quality=" + quality + "]";
	}
	

}
