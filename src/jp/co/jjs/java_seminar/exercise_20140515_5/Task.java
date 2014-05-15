package jp.co.jjs.java_seminar.exercise_20140515_5;

public class Task {

    String label;
    boolean isFinished;

    public Task(String label) {
        this.label = label;
    }

    public void finish() {
        this.isFinished = true;
    }

}
