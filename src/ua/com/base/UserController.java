package ua.com.base;

import java.util.List;

public class UserController {
    private final BookService bookService = new BookServiceImpl();
    public void create(Book book) { bookService.create(book); }
    public void update(Book book) { bookService.update(book); }
    public void delete(int id) {
        bookService.delete(id);
    }
    public Book findById(int id) {
        return bookService.findById(id);
    }
    public List<Book> findAll(String line) {
        return bookService.findAll();
    }
    public List<Book> findByNameBook(String NameBook) {
        return bookService.findByNameBook(NameBook);
    }
    public List<Book> findByNameWriter(String NameWriter) {
        return bookService.findByNameWriter(NameWriter);
    }
    public List<Book> findByBookGenre(String BookGenre) {
        return bookService.findByBookGenre(BookGenre);
    }
}
