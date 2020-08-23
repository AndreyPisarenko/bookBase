package ua.com.base;

import java.util.Objects;

public class Book {

    private int id;
    private String NameBook;
    private String NameWriter;
    private String BookGenre;
    private int PublicationYear;
    private int NumbersOfPages;
    private int NumberOfAwards;

    ////////////////////
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //////////////////////////
    public String getNameBook() {
        return NameBook;
    }

    public void setNameBook(String nameBook) {
        if (nameBook != null && nameBook.isBlank()) {
        } else {
            throw new RuntimeException("Введите корректное название книги!");
        }
        this.NameBook = nameBook;
    }

    /////////////////////////////////
    public String getNameWriter() {
        return NameWriter;
    }

    public void setNameWriter(String nameWriter) {
        if (nameWriter != null && nameWriter.isBlank()) {
        } else {
            throw new RuntimeException("Введите корректное имя писателя!");
        }
        this.NameWriter = nameWriter;
    }

    ////////////////////////////////////
    public String getBookGenre() {
        return BookGenre;
    }

    public void setBookGenre(String bookGenre) {
        if (bookGenre != null && bookGenre.isBlank()) {
        } else {
            throw new RuntimeException("Введите корректный жанр!");
        }
        this.BookGenre = bookGenre;
    }

    ///////////////////////////
    public int getPublicationYear() {
        return PublicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        if (publicationYear > 1000 && publicationYear < 2020) {
        } else {
            throw new RuntimeException("Введите корректную дату публикации!");
        }
        this.PublicationYear = publicationYear;
    }

    ////////////////////////////
    public int getNumbersOfPages() {
        return NumbersOfPages;
    }

    public void setNumbersOfPages(int numbersOfPages) {
        if (numbersOfPages > 0 && numbersOfPages < 2000) {
        } else {
            throw new RuntimeException("Введите корректное количество страниц!");
        }
        this.NumbersOfPages = numbersOfPages;
    }

    ////////////////////////////////
    public int getNumberOfAwards() {
        return NumberOfAwards;
    }

    public void setNumberOfAwards(int numberOfAwards) {
        if ( numberOfAwards > 0 && numberOfAwards < 150) {
        } else {
            throw new RuntimeException("Введите корректное количество наград!");
        }
        this.NumberOfAwards = numberOfAwards;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                PublicationYear == book.PublicationYear &&
                NumbersOfPages == book.NumbersOfPages &&
                NumberOfAwards == book.NumberOfAwards &&
                Objects.equals(NameBook, book.NameBook) &&
                Objects.equals(NameWriter, book.NameWriter) &&
                Objects.equals(BookGenre, book.BookGenre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, NameBook, NameWriter, BookGenre, PublicationYear, NumbersOfPages, NumberOfAwards);
    }
}
