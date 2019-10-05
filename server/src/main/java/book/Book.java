package book;

public class Book
{
    private int year;
    private int pages;

    private String id;
    private String title;
    private String author;
    private String isbn;
    private String publisher;

    public Book() { }

    public Book(int year, int pages, String id, String title, String author,
        String isbn, String publisher)
    {
        this.year      = year;
        this.pages     = pages;
        this.id        = id;
        this.title     = title;
        this.author    = author;
        this.isbn      = isbn;
        this.publisher = publisher;
    }

    @Override
    public String toString()
    {
        return String.format(
                "Książka       [%s]\n" +
                "Tytuł:        %s\n" +
                "Autor:        %s\n" +
                "Wydawnictwo:  %s\n" +
                "Data wydania: %d\n" +
                "Ilość stron:  %d\n" +
                "ISBN:         %s\n",

                id,
                title,
                author,
                publisher,
                year,
                pages,
                isbn
            );
    }

    public int getYear()
    {
        return this.year;
    }
    public void setYear(int year)
    {
        this.year = year;
    }

    public int getPages()
    {
        return this.pages;
    }
    public void setPages(int pages)
    {
        this.pages = pages;
    }

    public String getId()
    {
        return this.id;
    }
    public void setId(String id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return this.title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return this.author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getIsbn()
    {
        return this.isbn;
    }
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public String getPublisher()
    {
        return this.publisher;
    }
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }
}
