package in.shivudu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import in.shivudu.model.Book;
import in.shivudu.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository repository;
	
	@Override
	public String saveBook(@RequestBody Book book) {
		repository.save(book);
		return "Book Saved Successfully.....!!!";
	}

	@Override
	public List<Book> findAllBooks() {
		return repository.findAll();
	}

	@Override
	public String updateBook(@RequestBody Book book) {
		repository.save(book);
		return "Book Updated Successfully.....!!!";
	}

	@Override
	public String deleteBookId(@PathVariable Integer id) {
		repository.deleteById(id);
		return "One Book Deleted Successfully.....!!!";
	}

	@Override
	public String deleteAllBooks() {
		repository.deleteAll();
		return "All Books Deleted Successfully.....!!!";
	}

}
