package wk06;

public class Operation {

    private int left;
    private int right;

    public Operation(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int execute() {
        return left + right;
    }

    @Override
    public String toString() {
        return left + " + " + right + " = " + execute();
    }
}
