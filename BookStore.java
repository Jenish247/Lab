package com.labTest2;

import java.util.*;
import java.util.stream.Collectors;

class Book {
	int bookID;
	float price;
	String title,author,category;

	
	public Book(int bookID, String title, String author, String category, float price) {
		super();
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	void display()
	{
		System.out.println(bookID +" "+title+" "+author+ " "+category+ "  "+price);
	}
}

public class BookStore {

	public static void main(String[] args) {
		Book b =new Book(100, "python", "abc", "science", 220);
		Book b1 =new Book(101, "java", "xyz", "fiction", 250);
		Book b2 =new Book(102, "c++", "pqr", "technology", 280);
		b.display();
		b1.display();
		b2.display();
		//add a new Book object into the collection
		ArrayList<Book> mylist=new ArrayList<Book>();
		mylist.add(b);                            
		mylist.add(b1);
		mylist.add(b2);
		
		//search a book based on title and if found display the details
		List<String>searchByTitle =mylist.stream().map(p -> p.title).collect(Collectors.toList());
		System.out.println(searchByTitle);
	
		//search a book based on author and if found display the details
		List<String>searchByAuthor =mylist.stream().map(p1 -> p1.author).collect(Collectors.toList());
		System.out.println(searchByAuthor);
		
	}

}
