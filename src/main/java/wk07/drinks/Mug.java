package wk07.drinks;

public class Mug extends BeverageContainer {

    public Mug() {
        super(12);
    }

    public void fillContainer(int amount) {
        System.out.println("filling a mug");

    }
}
