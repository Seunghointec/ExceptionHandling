package be.intecbrussel.ExceptionDemo;

import java.text.NumberFormat;
import java.util.Scanner;

public class ExceptionApp {

    public static void main(String[] args) {

        System.out.println("This is the start of the application");

        Scanner keyboard =new Scanner(System.in);
        System.out.println("Please give me a number");
        //first word
        String firstNumber = keyboard.next();
        System.out.println("Please give me a number");
        String secondNumber = keyboard.next();

        //----------------------------------------

        int a = keyboard.nextInt();
        int b = keyboard.nextInt();

        //control check
        if (!(b == 0)) {
            System.out.println(a/b);
        } else {
            System.out.println("cannot divide by zero");
        }

        //wrapper class
        try {//similar to Do
            int firstInteger = Integer.parseInt(firstNumber);
            int secondInteger = Integer.parseInt(secondNumber);
            System.out.println(firstInteger + secondInteger);
        }catch (NumberFormatException nfe) {
            //if numberFormat not works then try common exception)
            nfe.printStackTrace();
        }catch(Exception e) { //we want to put exception in catch
            //Exception is the superclass exception
            //what should happen after try fails
            System.out.println("This is the exception");
        }

        System.out.println("This is the end of the application");
    }
}
