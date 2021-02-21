package com.makarand.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makarand.mvc.models.Book;
import com.makarand.mvc.repositories.BookRepository;

@Service

public class BookService {
	// adding the book repository as a dependency
	@Autowired
	private BookRepository bookRepository;

	// initialize the books variable with values
//	private List<Book> books = new ArrayList(Arrays.asList(
//			new Book("Harry Potter and the Sorcerer's Stone", "A boy wizard saving the world", "english", 309),
//			new Book("The Great Gatsby", "The story primarily concerns the young and mysterious millionaire Jay Gatsby",
//					"english", 180),
//			new Book("Moby Dick", "The saga of Captain Ahab", "english", 544),
//			new Book("Don Quixote", "Life of a retired country gentleman", "english", 150),
//			new Book("The Odyssey", "Ancient Greek epic poem", "english", 475)));

	// returns all the books
	public List<Book> getAllBooks(){
		return this.bookRepository.findAll();
	}

	// create a book
	public Book createBook(Book b) {
		return this.bookRepository.save(b);
	}
	public Book createBook(String title, String description, String author, String language, int numberOfPages) {
		Book newBook = new Book(title, description, author, language, numberOfPages);
		return this.bookRepository.save(newBook);
	}
	
	// retrieves a book
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
	//find Book byIndex
	public Book findBookByIndex(Long index) {
		
			return this.bookRepository.findById(index).orElse(null);
		}
	public Book updateBook(Long id, Book bookToUpdate) {
		return this.bookRepository.save(bookToUpdate);
	}


	//delete 		
	public void deleteBook(Long id) {
		this.bookRepository.deleteById(id);
	}
	

	
	
}
