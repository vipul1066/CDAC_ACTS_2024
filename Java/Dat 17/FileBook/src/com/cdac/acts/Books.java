package com.cdac.acts;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books implements Serializable  {
	private int id;
    private String title;
    private String author;
    private double price;
    
	public Books(int id, String title, String author, double price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
    
    

}
