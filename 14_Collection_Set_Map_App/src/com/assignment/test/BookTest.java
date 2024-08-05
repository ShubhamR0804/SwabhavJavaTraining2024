package com.assignment.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.assignments.model.Book;
import com.assignments.model.BookComparator;

public class BookTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of books to be entered : ");
		

		List<Book> books = new ArrayList<Book>();
		bookEntry(books, scanner);

		System.out.println("Un-Sorted List of Books\n");
		printDetails(books);

		System.out.println("\nFirst Sorting technique where the list is sorted first by Author , Title and then by Price\n");
		compareSort1(books);
		printDetails(books);

		System.out.println("\nSecond Sorting technique where the list is sorted first by Publication Year , Price and then by Author\n");
		compareSort2(books);
		printDetails(books);

	}

	private static void bookEntry(List<Book> books, Scanner scanner) {
		// TODO Auto-generated method stub
		int size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Book Number : " + (i + 1));
			System.out.println("Enter Book Title : ");
			String title = scanner.next();
			System.out.println("Enter Book Author : ");
			String author = scanner.next();
			System.out.println("Enter Publishing year of the book  : ");
			int publishingYear = scanner.nextInt();
			System.out.println("Enter Price of Book : ");
			double price = scanner.nextDouble();

			books.add(new Book(title, author, price, publishingYear));
		}
	}

	private static void printDetails(List<Book> books) {
		for (Book book : books) {
			System.out.println(book);
		}
	}

	public static void compareSort1(List<Book> books) {
		books.sort(new BookComparator.BookAuthorComparator().thenComparing(
				new BookComparator.BookTitleComparator().thenComparing(new BookComparator.BookPriceComparator())));

	}

	public static void compareSort2(List<Book> books) {
		books.sort(new BookComparator.BookPublicationYearComparator().thenComparing(
				new BookComparator.BookPriceComparator().thenComparing(new BookComparator.BookAuthorComparator())));

	}
}
