package ua.com.base;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookDaoImpl implements BookDao {

    private final List<Book> books = new ArrayList<>();


    @Override
    public void create(Book book) {
        books.add(book);
    }

    @Override
    public void update(Book book) {
        boolean exist = false;
        for (Book currentBook : books) {
            if (currentBook.getId() == book.getId()) {
                currentBook.setNameBook(book.getNameBook());
                currentBook.setPublicationYear(book.getPublicationYear());
                exist = true;
            }
        }
        if (!exist) {
            throw new RuntimeException("Книга не найдена!");
        }
    }

    @Override
    public void delete(int id) {
        boolean exist = false;
        for (Book currentBook : books) {
            if (currentBook.getId() == id) {
                books.remove(currentBook);
                exist = true;
                break;
            }
        }
        if (!exist) {
            throw new RuntimeException("Книга не найдена!");
        }
    }

    @Override
    public Book findById(int id) {
        for (Book currentBook : books) {
            if (currentBook.getId() == id) {
                return currentBook;
            }
        }
        throw new RuntimeException("User not found");
    }

    @Override
    public List<Book> findAll() { return books; }


    @Override
    public List<Book> findByNameBook(String NameBook) {

        return books.stream().filter(book -> book.getNameWriter().equals(NameBook)).collect(Collectors.toList());
    }

    @Override
    public List<Book> findByNameWriter(String NameWriter) {

        return books.stream().filter(book -> book.getNameWriter().equals(NameWriter)).collect(Collectors.toList());
    }

    @Override
    public List<Book> findByBookGenre(String BookGenre) {

        return books.stream().filter(book -> book.getBookGenre().equals(BookGenre)).collect(Collectors.toList());
    }

//    @Override
//    public List<Book> findByNumbersOfPages(int NumbersOfPages) {
//        return  books.stream().filter(book -> book.getNumbersOfPages().equals(NumbersOfPages)).collect(Collectors.toList());
//    }
//
//    @Override
//    public List<Book> findByNumberOfAwards(int NumberOfAwards) {
//        return  books.stream().filter(book -> book.getNumberOfAwards().equals(NumberOfAwards)).collect(Collectors.toList());
//    }
}
