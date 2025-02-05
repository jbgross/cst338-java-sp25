package wk02;

import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 5;
//        System.out.println(b/a);
//        System.out.print("Enter your name: ");
//        String name = in.next();
//        System.out.println("Your name is: " + name);
        int age;
        while(true) {
            try {
                System.out.print("Enter your age: ");
                age = in.nextInt();
            } catch (Exception e) {
//            System.out.println(age);
                System.out.println("No, try an int value next time");
                in.next();
                continue;
//                System.out.println("Something bad happened");
//                e.printStackTrace();
//                return;
            }
            break;
        }
        System.out.println("Your age is: " + age);


    }
}