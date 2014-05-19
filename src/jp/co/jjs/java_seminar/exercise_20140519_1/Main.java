package jp.co.jjs.java_seminar.exercise_20140519_1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> books = BookReader.read("Book1.csv");
        BookShelf bookshelf = new BookShelf();
        bookshelf.addAll(books);
        bookshelf.showAll();

        BookWriter.write("Book2.csv", bookshelf.getAll());

    }
}
