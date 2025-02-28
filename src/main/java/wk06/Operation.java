package wk06;

public abstract class Operation {

    private final int left;


    private final int right;

    public Operation(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public abstract int execute();

    @Override
    public abstract String toString();

    public int getRight() {
        return right;
    }

    public int getLeft() {
        return left;
    }

}
