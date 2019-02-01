package com.dmeo.api;

import com.dmeo.model.Book;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * BookController
 * @author 10905
 */
@RestController
public class BookController {

	@RequestMapping(value = "/book/{bookId}", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Book findBook(@PathVariable Integer bookId) {
		Book book = new Book();
		book.setId(bookId);
		book.setName("Workflow讲义");
		book.setAuthor("张晓祥");
		return book;
	}
}
