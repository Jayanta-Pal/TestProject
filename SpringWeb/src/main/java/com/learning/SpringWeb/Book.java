package com.learning.SpringWeb;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
	@Autowired
	Dance dance;
	long id;
	String name;
	String author;
	public Book(long id, String name, String author) {
		super();
		//dance.f1();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
}
