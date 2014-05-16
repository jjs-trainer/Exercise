package jp.co.jjs.java_seminar.exercise_20140516_2;

public class Task {

    private String label;
    private boolean isFinished;

    public Task(String label) {
        this.label = label;
    }

    public void finish() {
        this.isFinished = true;
    }

    public String getLabel() {
        return this.label;
    }

    public boolean isFinished() {
        return this.isFinished;
    }

    @Override
    public String toString() {
        return String.format("%s%s",
                this.label, this.isFinished ? "(DONE)": "");
    }

}
