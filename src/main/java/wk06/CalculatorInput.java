package wk06;


import java.util.Scanner;

/**
 * Use the Singleton patter
 *
 */
public class CalculatorInput {

    private Scanner in;
    public static final CalculatorInput instance;

    static {
        System.out.println("running static init");
        instance = new CalculatorInput();
    }

    private CalculatorInput() {
        System.out.println("running constructor");
        in = new Scanner(System.in);
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


}
