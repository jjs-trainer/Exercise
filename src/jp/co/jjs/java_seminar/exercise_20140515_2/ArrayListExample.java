package jp.co.jjs.java_seminar.exercise_20140515_2;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("bbb");

        list.remove(0);

        System.out.println(list.size());

        for (String str: list) {
            System.out.println(str);
        }

        System.out.println(list);
    }
}
