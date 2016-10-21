package com.test.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {

	private int id;
	private String name;
	private BookDetail bookDetail;

	public Book() {

	}

	public Book(String name) {
		this.name = name;
	}

	public Book(String name, BookDetail bookDetail) {
		this.name = name;
		this.bookDetail = bookDetail;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="book_detail_id")
	public BookDetail getBookDetail() {
		return bookDetail;
	}

	public void setBookDetail(BookDetail bookDetail) {
		this.bookDetail = bookDetail;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", bookDetails=" + bookDetail + "]";
	}

}
