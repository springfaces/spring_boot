package com.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="book_detail")
public class BookDetail {
	
	private Integer id;
	private Integer numberOfPages;
	private Book book;
	
	
	public BookDetail() {
		
	}
	
	
	public BookDetail(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name= "number_of_pages")
	public Integer getNumberOfPages() {
		return numberOfPages;
	}


	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	
	@OneToOne(mappedBy="bookDetail")
	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}
	
	
}
