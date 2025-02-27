package wk06;

public class Calculator {

    public Calculator() {

    }

    public void run() {
        CalculatorInput ci = CalculatorInput.getInstance();
        int left = ci.getInt();
        int right = ci.getInt();
        Operation o1 = new Operation(left, right);
        System.out.println("Result: " + o1);
    }
}
