package wk06;


import java.util.Scanner;

/**
 * Use the Singleton patter
 *
 */
public class CalculatorInput {

    private Scanner in;
//    public static final CalculatorInput instance;
    private static CalculatorInput instance;

//    static {
//        System.out.println("running static init");
//        instance = new CalculatorInput();
//    }

    private CalculatorInput() {
//        System.out.println("running constructor");
        in = new Scanner(System.in);
    }

    public static CalculatorInput getInstance() {
        if(instance == null) {
            instance = new CalculatorInput();
        }
        return instance;
    }

    public int getInt() {
        do {
            System.out.print("Enter an int value: ");
            if(in.hasNextInt()) {
                return in.nextInt();
            } else {
                in.nextLine();
            }
        } while(true);
    }

    public char getOperation() {
        do {
            System.out.print("Enter operation (+ =): ");
            String input = in.next();

            if(input.startsWith("+") || input.startsWith("=") ) {
                return input.charAt(0);
            }
        } while(true);
    }


}
