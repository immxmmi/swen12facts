package at.technikum.service;


import at.technikum.model.Book;
import at.technikum.repository.BookRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class BookService {

    @Inject
    BookRepository bookRepository;

    public List<Book> listAll() {
        return bookRepository.listAll();
    }

    public Book findById(Long id) {
        return bookRepository.findById(id);
    }

    @Transactional
    public Book addBook(Book book) {
        bookRepository.mergeAndFlush(book);
        return book;
    }

    @Transactional
    public Book updateBook(Long id, Book book) {
        Book entity = bookRepository.findById(id);
        if(entity != null) {
            entity.setTitle(book.getTitle());
            entity.setAuthor(book.getAuthor());
        }
        return entity;
    }

    @Transactional
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
