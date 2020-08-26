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
            System.out.println(" 0 Закончить программу ");
            while ((line = reader.readLine()) != null) {

                if (line.equals("0")) {
                    System.exit(1);
                }
                if (line.equals("1")) {
                    createUser(line, reader);
                }
                if (line.equals("2")) {
                    updateUser(line, reader);
                }
                if (line.equals("3")) {
                    deleteUser(line, reader);
                }
                if (line.equals("4")) {
                    findByName(line, reader);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void createUser(String line, BufferedReader reader) {

        try {
            System.out.println("Введите название книги ");
            line = reader.readLine();
            String nameBook = line;

            System.out.println("Введите год издания книги");
            line = reader.readLine();
            int publicationYear = Integer.parseInt(line);

            Book book = new Book();
            book.setNameBook(nameBook);
            book.setPublicationYear(publicationYear);

            controller.create(book);

            controller.findAll().forEach(System.out::println);

            System.out.println("book = " + controller.findAll());

        } catch (IOException e) {
            e.printStackTrace();


        }
    }

    private void updateUser(String line, BufferedReader reader) {

        try {

            System.out.println("Введите id книги");
            line = reader.readLine();
            int id = Integer.parseInt(line);

            System.out.println("Введите название книги ");
            line = reader.readLine();
            String nameBook = line;

            System.out.println("Введите год издания книги");
            line = reader.readLine();
            int publicationYear = Integer.parseInt(line);

            Book book = controller.findById(id);
            book.setNameBook(nameBook);
            book.setPublicationYear(publicationYear);

            controller.update(book);
            controller.findAll().forEach(System.out::println);

            System.out.println("book = " + controller.findAll());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void deleteUser(String line, BufferedReader reader) {

        try {

            System.out.println("Введите id книги");
            line = reader.readLine();
            int id = Integer.parseInt(line);

            controller.delete(id);
            controller.findAll().forEach(System.out::println);

            System.out.println("book = " + controller.findAll());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Метод выкидывает налпоинтер!
    private void findByName(String line, BufferedReader reader) {
        try {
            System.out.println("Введите название книги");
            line = reader.readLine();
            List<Book> users = controller.findByNameBook(line);
            users.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
