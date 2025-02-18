package wk05;

import java.util.ArrayList;

public class Couch extends Seat{

    private ArrayList<Person> sitters;
    public static final int DEFAULT_COUCH_SIZE = 3;
    private int size;

    public Couch(int size) {
        super();
        this.size = size;
        this.sitters = new ArrayList<>();
    }

    public Couch() {
        this(DEFAULT_COUCH_SIZE);
    }

    @Override
    public void sit(Person p) {
        this.sitters.add(p);
    }
}
