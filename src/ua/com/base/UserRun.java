package ua.com.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserRun {

    UserController controller = new UserController();

    public void run() {
        UserController controller = new UserController();
        String stringLine = "";
        String line = "";
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Выберите пункт меню ");
            line = reader.readLine();
            System.out.println("line = " + line);

            if (line.equals("1")){
                System.out.println("Введите название книги ");
                line=reader.readLine();
                String nameBook = line;
                System.out.println("Название = " + line);

                System.out.println("Введите год издания книги");
                line=reader.readLine();
                System.out.println("Название = " + line);
                int publicationYear = Integer.parseInt(line);

                Book book =new Book();
                book.setNameBook(nameBook);
                book.setPublicationYear(publicationYear);

                controller.create(book);

                System.out.println("book = " + controller.findAll());
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
