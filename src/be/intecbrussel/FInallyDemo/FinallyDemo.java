package be.intecbrussel.FInallyDemo;

import java.util.Scanner;

public class FinallyDemo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();

        System.out.println(calculate((a, b,false));

        keyboard.close();
    }

    public static int calculate(int a, int b, boolean isDivision) {
        if (isDivision) {
            try {
                System.out.println("calculation is done");
                return a / b;
            }finally {
                System.out.println("calucaltion is done");
            }
        }else {

            return a*b;
        }
    }
}
