package ua.com.base;

import java.util.ArrayList;
import java.util.List;

public class BookDaoImplJava implements BookDao {

    private List<Book> books = new ArrayList<>();


    @Override
    public void create(Book book) {
        books.add(book);
    }

    @Override
    public void update(Book book) {
        Book currentBook;
        for (Book b : books) {
            if (b.getId() == book.getId()){
                b.setNameBook(book.getNameBook());
                b.setPublicationYear(book.getPublicationYear());
            }
        }
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Book findById(int id) {
        return null;
    }

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public List<Book> findByNameBook(String NameBook) {
        return null;
    }

    @Override
    public List<Book> findByNameWriter(String NameWriter) {
        return null;
    }

    @Override
    public List<Book> findByBookGenre(String BookGenre) {
        return null;
    }
}
