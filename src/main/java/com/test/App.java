package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.apache.catalina.core.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.model.Book;
import com.test.model.BookDetail;
import com.test.model.Car;
import com.test.model.CarDetail;
import com.test.model.Student;
import com.test.model.Subject;
import com.test.repository.BookRepository;
import com.test.repository.CarDetailRepository;
import com.test.repository.StudentRepository;
import com.test.repository.SubjectRepository;

@SpringBootApplication
public class App implements CommandLineRunner {
	
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	
	@Autowired
	private  BookRepository bookRepository;
	
	@Autowired
	private CarDetailRepository carDetailRepository;
	
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	@Autowired
	private StudentRepository studentRepository;

	public static void main(String [] args) {
		SpringApplication.run(App.class, args);
	}

	
	/*public void run(String... strings) throws Exception {
		
		List<Book> books = new ArrayList<>();
		
		books.add(new Book("Book A", new BookDetail(49)));
		books.add(new Book("Book B", new BookDetail(59)));
		books.add(new Book("Book C", new BookDetail(69)));
		books.add(new Book("Book D", new BookDetail(79)));
		
		
		bookRepository.save(books);
		
		//fetch all books
		for (Book book : bookRepository.findAll()) {
			 logger.info(book.toString());
		}
	}*/
	
	/*@SuppressWarnings("serial")
	@Transactional
	public void run(String...strings) throws Exception {
		final CarDetail categoryA = new CarDetail("Honda");
		
		Set<Car> hondaCars = new HashSet<Car>(){{
				add(new Car("civic", categoryA));
				add(new Car("accord", categoryA));
				add(new Car("accura", categoryA));
			}};
			categoryA.setCars(hondaCars);
			
			final CarDetail categoryB = new CarDetail("Toyota");
			
			Set<Car> toyotaCars = new HashSet<Car>(){{
					add(new Car("corolla", categoryB));
					add(new Car("camery", categoryB));
					add(new Car("lexus", categoryB));
				}};
				categoryB.setCars(toyotaCars);
		    
			carDetailRepository.save(new HashSet<CarDetail>() 
					{{
						add(categoryA);
						add(categoryB);
					}});		
	}*/
	
	@SuppressWarnings("serial")
	public void run(String...strings) {
		final Subject  java = new Subject("JAVA");
		final Subject  oracle = new Subject("ORACLE");
		final Subject  unix = new Subject("UNIX");
		
		
		
		studentRepository.save(new HashSet<Student>() {{  
				add(new Student("Raghu", new HashSet<Subject>() {{
					add(java);
					add(oracle);
				}}));
				
				add(new Student("Ravi", new HashSet<Subject>() {{
					add(java);
					add(unix);
				}}));
			
		}});
	}
	
}
