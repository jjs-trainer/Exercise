package jp.co.jjs.java_seminar.exercise_20140519_1;

public class Book {

    private String title;
    private String isbn;
    private String author;
    private String publisher;
    private int price;

    public Book(String title, String isbn, String author, String publisher,
            int price) {

        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", isbn=" + isbn + ", author=" + author
                + ", publisher=" + publisher + ", price=" + price + "]";
    }


}
