package com.dayeightassignment.model;

public class BookApp {

	private int bookId;
	 private String bookName;
	 private String bookAuthor;
	 private double bookPrice;
	 
	 public BookApp(int bookId, String bookName, String bookAuthor, double bookPrice) {
	  this.bookId = bookId;
	  this.bookName = bookName;
	  this.bookAuthor = bookAuthor;
	  this.bookPrice = bookPrice;
	 }
	 
	 public int getBookId() {
	  return this.bookId;
	 }
	 
	 public void setBookId(int bookId) {
	  this.bookId = bookId;
	 }
	 
	 public String getBookAuthor() {
	  return this.bookAuthor;
	 }
	 
	 public void setbookAuthor(String bookAuthor) {
	  this.bookAuthor = bookAuthor;
	 }
	 
	 public String getBookName() {
	  return this.bookName;
	 }
	 
	 public void setBookName(String bookName) {
	  this.bookName = bookName;
	 }
	 
	 public double getBookPrice() {
	  return this.bookPrice;
	 }
	 
	 public void setBookPrice(double bookPrice) {
	  this.bookPrice = bookPrice;
	 }
	 
	 public void bookDetails() {
	  System.out.println("Book Id: "+getBookId());
	  System.out.println("Book Name: "+getBookName());
	  System.out.println("Book Author: "+getBookAuthor());
	  System.out.println("Book Price: $"+getBookPrice());
	 }
	 
	 public static BookApp[] sortedBooksPrice(BookApp[] prices) {
		 /*
	  BookApp lowprice = prices[0];
	  //double lowprice = prices[0].getBookPrice();
	  if(prices.length==0) {
	   return null;
	  }
	  else {
	   for(BookApp price : prices) {
	    if(lowprice.getBookPrice() > price.getBookPrice()) {
	     lowprice = price;
	    }
	   }
	   
	  }
	  return prices;
	 }
	 */
		 int[] indices = new int[prices.length];
		    for (int i = 0; i < prices.length; i++) {
		        indices[i] = i;
		    }

		    // Selection sort (descending order)
		    for (int i = 0; i < prices.length; i++) {
		        int maxIndex = i;
		        for (int j = i + 1; j < prices.length; j++) {
		            if (prices[j].getBookPrice() > prices[maxIndex].getBookPrice()) {
		                maxIndex = j;
		            }
		        }
		        // Swap the positions of the max element and the current element
		        int temp = indices[i];
		        indices[i] = indices[maxIndex];
		        indices[maxIndex] = temp;
		    }

		    // Create a new array with sorted books
		    BookApp[] sortedPrices = new BookApp[prices.length];
		    for (int i = 0; i < prices.length; i++) {
		        sortedPrices[i] = prices[indices[i]];
		    }
		    return sortedPrices;
		}
}
