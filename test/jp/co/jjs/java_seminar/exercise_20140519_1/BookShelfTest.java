package jp.co.jjs.java_seminar.exercise_20140519_1;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class BookShelfTest {

    BookShelf bookShelf;

    @Before
    public void setUp() {
        bookShelf = new BookShelf();
        bookShelf.bookList.add(
                new Book("title1", "isbn1", "author1", "publisher1", 1000));
        bookShelf.bookList.add(
                new Book("title2", "isbn2", "author2", "publisher2", 2000));
        bookShelf.bookList.add(
                new Book("title3", "isbn3", "author3", "publisher3", 3000));
    }

    @Test
    public void getAllメソッドを実行するとBookShelfが保持している件数文のBookオブジェクトを返すこと() {
        ArrayList<Book> actual = bookShelf.getAll();
        assertThat(actual.size(), is(3));
    }

    @Test
    public void getAllメソッドを実行するとBookShelfが保持しているすべてのBookオブジェクトを返すこと() {
        ArrayList<Book> actual = bookShelf.getAll();
        Book book1 = actual.get(0);
        assertThat(book1.getTitle(), is("title1"));
        assertThat(book1.getIsbn(), is("isbn1"));
        assertThat(book1.getAuthor(), is("author1"));
        assertThat(book1.getPublisher(), is("publisher1"));

        Book book2 = actual.get(1);
        assertThat(book2.getTitle(), is("title2"));
        assertThat(book2.getIsbn(), is("isbn2"));
        assertThat(book2.getAuthor(), is("author2"));
        assertThat(book2.getPublisher(), is("publisher2"));

        Book book3 = actual.get(2);
        assertThat(book3.getTitle(), is("title3"));
        assertThat(book3.getIsbn(), is("isbn3"));
        assertThat(book3.getAuthor(), is("author3"));
        assertThat(book3.getPublisher(), is("publisher3"));

    }

}
