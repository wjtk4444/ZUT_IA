import java.util.ArrayList;

import book.*;

class Main
{
    public static void main(String args[])
    {
        ArrayList<Book> books = new ArrayList<>()
        {{
            add(new Book(
                    2005,
                    1000,
                    "book1",
                    "Adam Tadeusz",
                    "Pan Mickiewicz",
                    "1234567890",
                    "Stara Era"
                ));
            add(new Book(
                    2005,
                    1000,
                    "book2",
                    "Pan Tadeusz",
                    "Adam Mickiewicz",
                    "1234567891",
                    "Stara Era"
                ));
            add(new Book(
                    2005,
                    1000,
                    "book3",
                    "Sienryk Henkiewicz",
                    "Lodem i mieczem",
                    "1234567892",
                    "Stara Era"
                ));
        }};

        BookManager bookManager = new BookManager(books);

        System.out.println("\nsearchByTitle(\"Tadeusz\")");
        for(Book book : bookManager.searchByTitle("Tadeusz"))
            System.out.println(book);

        System.out.println("\nsearchByAuthor(\"Mickiewicz\")");
        for(Book book : bookManager.searchByAuthor("Mickiewicz"))
            System.out.println(book);

        System.out.println("\nsearchByIsbn(\"1234567892\")");
        System.out.println(bookManager.searchByIsbn("1234567892"));
    }
}
