package ua.com.base;

import java.util.List;

public class BookServiceImpl implements BookService {

    private final BookDao bookDao = new BookDaoImpl();


    @Override
    public void create(Book book) {
        int size = bookDao.findAll().size();
        book.setId(++size);
    }

    @Override
    public void update(Book book) {

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
