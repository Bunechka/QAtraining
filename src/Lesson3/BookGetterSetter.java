package Lesson3;

public class BookGetterSetter {
    private String title;
     public BookGetterSetter (){}

     public BookGetterSetter (String title, String author, boolean newBook) {
         setAuthor(author);
         setTitle(title);
         this.newBook = newBook;
     }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public boolean isNewBook() {
        return newBook;
    }

    public void setNewBook(boolean newBook) {
        this.newBook = newBook;
    }

    private String publisher;
    private String author;
    private int pageCount;
    private boolean newBook;

}
