package in.shivudu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.shivudu.model.Book;
import in.shivudu.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService service;
	
	@PostMapping("/save")
	public String saveBook(@RequestBody Book book) {
		return service.saveBook(book);
	}

	@GetMapping("/findAll")
	public List<Book> findAllBooks(){
		return service.findAllBooks();
	}

	@PutMapping("/update")
	public String updateBook(@RequestBody Book book) {
		return service.updateBook(book);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBookId(@PathVariable Integer id) {
		return service.deleteBookId(id);
	}

	@DeleteMapping("/deleteAll")
	public String deleteAllBooks() {
		return service.deleteAllBooks();
	}
}
