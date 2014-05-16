package jp.co.jjs.java_seminar.exercise_20140516_2;

import java.util.ArrayList;

public class TaskList {

    private ArrayList<Task> taskList = new ArrayList<>();

    public void add(Task task) {
        taskList.add(task);
    }

    public void showAll() {
        for (Task task: taskList) {
           System.out.println(task);
        }
    }
}
