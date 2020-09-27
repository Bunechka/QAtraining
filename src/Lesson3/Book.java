package Lesson3;

public class Book {
    private String title;
    private String publisher;
    private String isbn;
    private int pageCount;

public Book () {
}

public Book (String title, int myPageCount) {
    this.title = title;
    pageCount = myPageCount;
}
    public Book (String title, String publisher, String isbn, int pageCount) {
        this.title = title;
        this.publisher = publisher;
        this.isbn = isbn;
        this.pageCount = pageCount;
    }
    public void printInformation () {
        System.out.println("Title " + this.title);
        System.out.println("Publisher " + this.publisher);
        System.out.println("ISBN" + this.isbn);
        System.out.println("Pages " + this.pageCount);
    }

}
