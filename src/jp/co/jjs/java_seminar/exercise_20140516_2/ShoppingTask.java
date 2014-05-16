package jp.co.jjs.java_seminar.exercise_20140516_2;

public class ShoppingTask extends Task {

    private int price;

    public ShoppingTask(String label, int price) {
        super(label);
        this.price = price;
    }


    @Override
    public String toString() {
        return String.format("%s(%d)%s",
                this.getLabel(), this.price, this.isFinished() ? "(DONE)": "");
    }

}
