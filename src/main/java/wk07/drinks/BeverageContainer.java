package wk07.drinks;

public abstract class BeverageContainer {

    private int size;
    public BeverageContainer(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }
    public abstract void fillContainer(int amount);
}
