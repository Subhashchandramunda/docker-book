package org.dxc.docker.Controller;

import org.dxc.docker.model.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@RequestMapping("/book")
	public Book showBook() {
		Book book=new Book(313,"gfhjtg");
		book.getBookId();
		book.getBookName();
		return book;
	}
}
