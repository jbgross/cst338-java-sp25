package wk06;
import java.io.*;
public class Runner {
    public static void main(String[] args) {
        System.out.println("starting code");
        CalculatorInput ci = CalculatorInput.getInstance();
        char op = ci.getOperation();
        System.out.println(op);
//        CalculatorInput ci = CalculatorInput.instance;
//        System.out.println(ci);
//        System.out.println(System.out.getClass());
        PrintStream ps = System.out;
        ps.print(ps.getClass());
        int x = ci.getInt();
        System.out.println("x = " + x);
        int y = CalculatorInput.getInstance().getInt();
//        int y = CalculatorInput.instance.getInt();
        CalculatorInput ci2 = CalculatorInput.getInstance();
    }
}
