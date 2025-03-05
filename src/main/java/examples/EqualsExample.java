package examples;

public class EqualsExample {
    public static void main(String[] args) {
        Foo f1 = new Foo(1, "hello");
        Foo f2 = new Foo(2, "goodbye");
        Foo f3 = new Foo(1, "hello");
        Foo f4 = new Grault(1, "hello");
        System.out.println(f2.equals(f1));
        System.out.println(f3.equals(f1));
        System.out.println(f1.equals(f4));
        System.out.println(f1.equals("string"));
    }

}

class Foo {
    private int bar;
    private String quux;
    public Foo(int bar, String quux) {
        this.bar = bar;
        this.quux = quux;
    }

//    @Override
    public boolean equals(Object o) {
        System.out.println("general equals");
////        if(o instanceof Foo) {
////            Foo f = (Foo) o;
////            return f.bar == this.bar && f.quux.equals(this.quux);
////        }
        return false;
    }

    public boolean equals(Foo f) {
        System.out.println("special equals");
        return f.bar == this.bar && f.quux.equals(this.quux);
    }
}

class Grault extends Foo {
    public Grault(int bar, String quux) {
        super(bar, quux);
    }
}