package jp.co.jjs.java_seminar.exercise_20140519_1;

import java.util.ArrayList;

public class BookShelf {

    private ArrayList<Book> bookList = new ArrayList<>();

    public void add(Book book) {
        bookList.add(book);
    }

    public void addAll(ArrayList<Book> books) {
        bookList.addAll(books);
    }

    public void showAll() {
        for (Book book: bookList) {
            System.out.println(book);
        }
    }
}
