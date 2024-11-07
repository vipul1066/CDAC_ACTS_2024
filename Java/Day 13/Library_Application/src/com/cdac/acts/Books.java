package com.cdac.acts;

import java.time.LocalDate;

public class Books {
	private String title;
	private BookType booktype;
	private Integer price;
	private LocalDate publishedDate;
	private String authorName;
	private Integer quantity;
	
	public Books(String title, BookType booktype, Integer price, LocalDate publishedDate, String authorName,
			Integer quantity) {
		this.title = title;
		this.booktype = booktype;
		this.price = price;
		this.publishedDate = publishedDate;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BookType getBooktype() {
		return booktype;
	}

	public void setBooktype(BookType booktype) {
		this.booktype = booktype;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public LocalDate getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Books [title=" + title + ", price=" + price + ", publishedDate=" + publishedDate + ", authorName="
				+ authorName + ", quantity=" + quantity + "]";
	}
	
	
	

}
