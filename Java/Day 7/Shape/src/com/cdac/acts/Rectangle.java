package com.cdac.acts;

public class Rectangle extends Shape {
	
	private double length;
	private double breadth;
	
	public Rectangle() {
		this.length = 0.0;
		this.breadth = 0.0;
	}
	
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	public double calculateArea() {
		double result = length * breadth;
		return result;
	}
	
	public double calculatePerimeter() {
		double result = 2 *(length + breadth);
		return result;
	}
	
	public String toString() {
		return "Rectangle [ Area = " + calculateArea() + "Perimeter = " + calculatePerimeter() +"]";
	}
}
