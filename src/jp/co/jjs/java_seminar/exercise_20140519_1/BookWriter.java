package jp.co.jjs.java_seminar.exercise_20140519_1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class BookWriter {

    public static void write(String csvFilePath, ArrayList<Book> books) {

        try (BufferedWriter writer = Files.newBufferedWriter(
                Paths.get(csvFilePath),
                Charset.forName("UTF-8"))) {

            // 1行目は列名を出力する
            writer.write("書籍名,ISBN番号,著者,出版社,価格");
            writer.newLine();

            for (Book book: books) {
                writer.write(book.getTitle() + ",");
                writer.write(book.getIsbn() + ",");
                writer.write(book.getAuthor() + ",");
                writer.write(book.getPublisher() + ",");
                writer.write(String.valueOf(book.getPrice()));
                writer.newLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
