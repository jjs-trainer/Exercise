package jp.co.jjs.java_seminar.exercise_20140515_5;

public class Main {
    public static void main(String[] args) {

        TaskList taskList = new TaskList();

        Task task1 = new Task("牛乳を買う");
        Task task2 = new Task("卵を買う");
        Task task3 = new Task("ArrayListを使えるようにする");

        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);

        task1.finish();
        task2.finish();

        taskList.showAll();
    }
}
