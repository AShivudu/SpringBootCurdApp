package in.shivudu.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shivudu.model.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
