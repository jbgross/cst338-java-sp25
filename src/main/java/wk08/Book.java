package wk08;
import java.util.List;
public class Book extends LibraryItem implements Printable {

    private final String title;
    private final String author;
    private final int pageCount;

    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void print() {
        System.out.println("I'm a book");
    }
}
