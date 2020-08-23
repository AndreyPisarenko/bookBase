package ua.com.base;

import java.util.List;

public interface BookDao {
    void create(Book book);

    void update(Book book);

    void delete(int id);

    Book findById(int id);

    List<Book> findAll(String findAll);

    List<Book> findByNameBook(String NameBook);

    List<Book> findByNameWriter(String NameWriter);

    List<Book> findByBookGenre(String BookGenre);
}
