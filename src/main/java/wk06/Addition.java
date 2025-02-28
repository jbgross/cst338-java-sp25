package wk06;

public class Addition extends Operation {

    public Addition(int left, int right) {
        super(left, right);
    }

    public int execute() {
        return getLeft() + getRight();
    }

    public String toString() {
        return getLeft() + " + " + getRight() + " = " + execute();
    }
}
