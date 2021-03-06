package ua.com.base;

import java.util.List;

public interface BookService{

    void create(Book book);
    void update(Book book);
    void delete(int id);
    Book findById(int id);
    List<Book> findAll();
    List<Book> findByNameBook(String NameBook);
    List<Book> findByNameWriter(String NameWriter);
    List<Book> findByBookGenre(String BookGenre);
//    List<Book> findByNumbersOfPages(int NumbersOfPages);
//    List<Book> findByNumberOfAwards(int NumberOfAwards);
}
