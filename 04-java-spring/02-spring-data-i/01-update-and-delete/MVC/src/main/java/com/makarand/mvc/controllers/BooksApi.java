package com.makarand.mvc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.makarand.mvc.models.Book;
import com.makarand.mvc.services.BookService;

@RestController
@RequestMapping("/api")
public class BooksApi {
	private BookService bookService;

	public BooksApi(BookService bookService) {
        this.bookService = bookService;
    }

	@RequestMapping("/books")
	public List<Book> index() {
		// return this.bookService.allBooks();
		System.out.println(bookService.getAllBooks());
		return this.bookService.getAllBooks();
	}

	@RequestMapping(value = "/books", method = RequestMethod.POST)
	public Book create(@RequestParam(value = "title") String title, @RequestParam(value = "description") String desc,
			@RequestParam(value = "languages") String lang, @RequestParam(value = "pages") Integer numOfPages) {
		Book book = new Book(title, desc, lang, lang, numOfPages);
		return bookService.createBook(book);
	}

	@RequestMapping("/books/{id}")
	public Book show(@PathVariable("id") Long id) {
		Book book = bookService.findBook(id);
		return book;
	}
	@RequestMapping(value="/books/update/{id}", method=RequestMethod.PUT)
    public Book update(@PathVariable("id") Long id, Book updatedBook) {
        Book book = bookService.updateBook(id, updatedBook);
        return book;
    }
}