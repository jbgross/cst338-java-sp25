package wk06;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setHeight(int side) {
        setWidth(side);
    }

    public void setWidth(int side) {
        super.setHeight(side);
        super.setWidth(side);
    }
}
