package wk05;

public class Chair extends Seat {
    private Person sitter;
    public Chair() {
        super();
        sitter = null;
    }

//    @Override
//    public void foo() {
//
//    }

    public void sit(Person p) {
        if(sitter == null) {
            this.sitter = p;
        } else {
            throw new
                    RuntimeException("someone is already sitting here");
        }
    }
}
