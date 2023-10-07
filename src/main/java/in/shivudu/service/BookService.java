package in.shivudu.service;

import java.util.List;

import in.shivudu.model.Book;

public interface BookService {

	public String saveBook(Book book);

	public List<Book> findAllBooks();

	public String updateBook(Book book);

	public String deleteBookId(Integer id);

	public String deleteAllBooks();
}
