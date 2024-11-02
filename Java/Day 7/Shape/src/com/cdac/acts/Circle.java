package com.cdac.acts;

public class Circle extends Shape {
	private double radius;
	private final double PI = 3.14;
	
	public Circle() {
		this.radius = 0.0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	public double calculateArea() {
		double result = PI * radius * radius;
		return result;
	}
	
	public double calculatePerimeter() {
		double result = 2 * PI * radius;
		return result;
	}
	
	public void draw(){
		System.out.println("No need to draw real Circle");
	}
	
	public String toString() {
		return "Circle [ Area = " + calculateArea() + "Perimeter = " + calculatePerimeter() + "]";
	}
	
	

}
