package jp.co.jjs.java_seminar.exercise_20140516_2;

public class Main {
    public static void main(String[] args) {

        TaskList taskList = new TaskList();

        Task task1 = new ShoppingTask("牛乳を買う", 140);
        Task task2 = new ShoppingTask("卵を買う", 180);
        Task task3 = new Task("ArrayListを使えるようにする");

        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);

        task1.finish();
        task2.finish();

        taskList.showAll();
    }
}
