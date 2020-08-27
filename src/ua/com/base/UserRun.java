package ua.com.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class UserRun {

    UserController controller = new UserController();

    public void run() {
        UserController controller = new UserController();
        String stringLine = "";
        String line = "";
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Выберите пункт меню ");
            System.out.println(" 1 Внести книгу ");
            System.out.println(" 2 Обновить данные о книге по id ");
            System.out.println(" 3 Удалить книгу по id ");
            System.out.println(" 4 Найти по названию ");
            System.out.println(" 5 Вывести все книги ");

            System.out.println(" 0 Закончить программу ");
            while ((line = reader.readLine()) != null) {
                if (line.equals("0")) {
                    System.exit(1); }
                if (line.equals("1")) {
                    createBook(line, reader); }
                if (line.equals("2")) {
                    updateBook(line, reader); }
                if (line.equals("3")) {
                    deleteBook(line, reader); }
                if (line.equals("4")) {
                    findByName(line, reader); }
                if (line.equals("5")) {
                    findAll(line, reader); }

                System.out.println("Выберите пункт меню ");
                System.out.println(" 1 Внести книгу ");
                System.out.println(" 2 Обновить данные о книге по id ");
                System.out.println(" 3 Удалить книгу по id ");
                System.out.println(" 4 Найти по названию ");
                System.out.println(" 5 Вывести все книги ");

                System.out.println(" 0 Закончить программу ");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void createBook(String line, BufferedReader reader) {
        try {
            System.out.println("Введите название книги:");
            line = reader.readLine();
            String nameBook = line;

            System.out.println("Введите автора:");
            line = reader.readLine();
            String nameWriter = line;

            System.out.println("Введите жанр книги:");
            line = reader.readLine();
            String bookGenre = line;

            System.out.println("Введите год издания книги:");
            line = reader.readLine();
            int publicationYear = Integer.parseInt(line);

            System.out.println("Введите колличество страниц:");
            line = reader.readLine();
            int numbersOfPages = Integer.parseInt(line);

            System.out.println("Введите колличество наград:");
            line = reader.readLine();
            int numberOfAwards = Integer.parseInt(line);

            Book book = new Book();
            book.setNameBook(nameBook);
            book.setPublicationYear(publicationYear);
            book.setNumbersOfPages(numbersOfPages);
            book.setNumberOfAwards(numberOfAwards);
            book.setNameWriter(nameWriter);
            book.setBookGenre(bookGenre);

            controller.create(book);
            controller.findAll(line).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateBook(String line, BufferedReader reader) {
        try {
            System.out.println("Введите id книги:");
            line = reader.readLine();
            int id = Integer.parseInt(line);

            System.out.println("Введите название книги:");
            line = reader.readLine();
            String nameBook = line;

            System.out.println("Введите автора:");
            line = reader.readLine();
            String nameWriter = line;

            System.out.println("Введите жанр книги:");
            line = reader.readLine();
            String bookGenre = line;

            System.out.println("Введите год издания книги:");
            line = reader.readLine();
            int publicationYear = Integer.parseInt(line);

            System.out.println("Введите колличество страниц:");
            line = reader.readLine();
            int numbersOfPages = Integer.parseInt(line);

            System.out.println("Введите колличество наград:");
            line = reader.readLine();
            int numberOfAwards = Integer.parseInt(line);


            Book book = controller.findById(id);
            book.setNameBook(nameBook);
            book.setPublicationYear(publicationYear);
            book.setNumbersOfPages(numbersOfPages);
            book.setNumberOfAwards(numberOfAwards);
            book.setNameWriter(nameWriter);
            book.setBookGenre(bookGenre);

            controller.update(book);
            controller.findAll(line).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void deleteBook(String line, BufferedReader reader) {

        try {
            System.out.println("Введите id книги:");
            line = reader.readLine();
            int id = Integer.parseInt(line);
            controller.delete(id);
            controller.findAll(line).forEach(System.out::println);
            System.out.println("book = " + controller.findAll(line));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void findByName(String line, BufferedReader reader) {
        try {
            System.out.println("Введите название книги");
            line = reader.readLine();
            List<Book> books = controller.findByNameBook(line);
            books.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void findAll (String line, BufferedReader reader){
        List<Book> books = controller.findAll(line);
        books.forEach(System.out::println);
        
    }
}
