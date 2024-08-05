package com.techlabs.model;

public class Book {
	
	private int bookId;
	private String name;
	private String author;
	private double price;
	private String publication;
	public Book(int bookId, String name, String author, double price, String publication) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.price = price;
		this.publication = publication;
	}
	
	public String getName() {
		return name;
	}
	
	public int getBookId() {
		return bookId;
	}
	
	public  String getAuthor() {
		return author;
		
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getPublication() {
		return publication;
	}
	
	public  void setName(String name) {
		this.name = name;
	}
	
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public  void setAuthor(String author) {
		this.author = author;
	}
	
	public  void setPrice(double price) {
		this.price = price;

}
	
}
