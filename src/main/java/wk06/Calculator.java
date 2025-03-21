package wk06;

import java.util.*;
public class Calculator {

    private Deque<Operation> history = new ArrayDeque<>();


    public Calculator() {

    }

    public void run() {
        CalculatorInput ci = CalculatorInput.getInstance();
        char op = ci.getOperation();
        int left = 0;
        while(op != '=') {
            if(left == 0) {
                left = ci.getInt();
            }

            int right = ci.getInt();
            Operation o1;
            if(op == '*') {
                o1 = new Multiplication(left, right);
            } else {
                o1 = new Addition(left, right);
            }

            System.out.println("Result: " + o1);
            history.addLast(o1);
            op = ci.getOperation();
            left = o1.execute();
        }
    }

    public void printHistory() {
        for(Operation o : history) {
            System.out.println(o);
        }
    }
}
