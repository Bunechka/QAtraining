package Lesson3;

public class BookGetterSetterDemo {
    public static void main(String[] args) {
        BookGetterSetter book = new BookGetterSetter();
        book.setAuthor("John Doe");
        System.out.println (book.getAuthor());

        BookGetterSetter book1 = new BookGetterSetter("Phantasie", "wasn't me", true);
        System.out.println (book1.getTitle());
        System.out.println (book1.getAuthor());
        System.out.println (book1.isNewBook());

    }
}
