package wk07.drinks;

public class WaterBottle extends BeverageContainer{

    private boolean capped;

    public WaterBottle() {
        super(16);
        capped = true;
    }

    public void uncap() {
        capped = false;
    }

    @Override
    public void fillContainer(int amount) {
        if(capped) {
            throw new RuntimeException("can't fill capped water bottle");
        }
    }
}
