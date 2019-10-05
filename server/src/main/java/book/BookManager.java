package book;

import java.util.List;
import java.util.ArrayList;

public class BookManager
{
    private List<Book> books;

    public BookManager(List<Book> books)
    {
        this.books = books;
    }

    public List<Book> searchByTitle(String title)
    {
        List<Book> found = new ArrayList<>();
        for (Book book : books)
            if (book.getTitle().toLowerCase().contains(title.toLowerCase()))
                found.add(book);

        return found;
    }
    
    public List<Book> searchByAuthor(String author)
    {
        List<Book> found = new ArrayList<>();
        for (Book book : books)
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase()))
                found.add(book);

        return found;
    }

    public Book searchByIsbn(String isbn)
    {
        for (Book book : books)
            if (book.getIsbn().equalsIgnoreCase(isbn))
                return book;

        return null;
    }
}
