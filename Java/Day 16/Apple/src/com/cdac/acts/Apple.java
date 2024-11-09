package com.cdac.acts;

public class Apple {
	private Integer weight;
	private String color;
	private String taste;
	
	public Apple(Integer weight, String color, String taste) {
		this.weight = weight;
		this.color = color;
		this.taste = taste;
	}
	
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	@Override
	public String toString() {
		return "Apple [weight=" + weight + ", color=" + color + ", taste=" + taste + "]";
	}
}
