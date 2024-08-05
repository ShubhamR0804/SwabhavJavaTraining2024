package com.techlabs.test;

import java.util.Scanner;
import com.techlabs.model.*;

public class BookTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Book books[] = new Book[5];
		
		for(int i=0; i<books.length; i++)
		{
			System.out.println("Enter Book ID : ");
			int bookId = scanner.nextInt();
			System.out.println("Enter Book Name : ");
			String bookName = scanner.next();
			System.out.println("Enter Book Author : ");
			String bookAuthor = scanner.next();
			System.out.println("Enter Book Price : ");
			double bookPrice = scanner.nextDouble();
			System.out.println("Enter Book Publication : ");
			String bookPublication = scanner.next();
			
			books[i] = new Book(bookId, bookName, bookAuthor, bookPrice, bookPublication);
			
		}
		
		for(int i=0;i<books.length;i++) {
			System.out.println("Book ID : "+books[i].getBookId());
			System.out.println("Book Name : "+books[i].getName());
			System.out.println("Book Author : "+books[i].getAuthor());
			System.out.println("Book Price : "+books[i].getPrice());
			System.out.println("Book Publication : "+books[i].getPublication());
			

		}
	}

}
