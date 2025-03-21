package wk06;

public class Multiplication extends Operation {

    public Multiplication(int left, int right) {
        super(left, right);
    }

    public int execute() {
        return getLeft() * getRight();
    }

    public String toString() {
        return getLeft() + " * " + getRight() + " = " + execute();
    }
}
