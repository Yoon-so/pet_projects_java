public class Book {
    String title;
    String author;

    public Book(String t) {
        title = t; author = "Unknown";
    }

    public Book(String t, String a) {
        title = t; author = a;
    }
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        System.out.println(book1.title + ", " + book1.author);
        System.out.println(book2.title + ", " + book2.author);
    }
}
