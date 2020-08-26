package ua.com.base;

import java.util.List;

public class BookServiceImpl implements BookService {

    private final BookDao bookDao = new BookDaoImpl();


    @Override
    public void create(Book book) {
        int size = bookDao.findAll().size();
        book.setId(++size);
        bookDao.create(book);
    }

    @Override
    public void update(Book book) {
        if (book.getId() <= 0){
            throw new RuntimeException("Некоректный id");
        }
            bookDao.update(book);
    }

    @Override
    public void delete(int id) {
        if (id <= 0){
            throw new RuntimeException("Некоректный id");
        }
        bookDao.delete(id);
    }

    @Override
    public Book findById(int id) {
        return bookDao.findById(id);
    }

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Override
    public List<Book> findByNameBook(String NameBook) {
        return bookDao.findByNameBook(NameBook);
    }

    @Override
    public List<Book> findByNameWriter(String NameWriter) {
        return bookDao.findByNameWriter(NameWriter);
    }

    @Override
    public List<Book> findByBookGenre(String BookGenre) {
        return bookDao.findByBookGenre(BookGenre);
    }
}
