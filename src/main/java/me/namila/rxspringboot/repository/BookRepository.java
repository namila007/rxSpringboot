package me.namila.rxspringboot.repository;

import me.namila.rxspringboot.model.Book;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends ReactiveCrudRepository<Book, String> {
}
