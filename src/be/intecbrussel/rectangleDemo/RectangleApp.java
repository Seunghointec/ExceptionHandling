package be.intecbrussel.rectangleDemo;

import be.intecbrussel.rectangleDemo.Exception.NegativeWidthException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RectangleApp {

    public static void main(String[] args) throws Exception {

        Rectangle myRectangle = askAndCreateRectangle();
        System.out.println(myRectangle);
    }


    //helper method to main method


    private static Rectangle askAndCreateRectangle() throws Exception {
        Scanner keyboard = new Scanner(System.in);
       Rectangle myRectangle;
        try {
            System.out.println("what is the length of the rectangle");
            double length = keyboard.nextDouble();
            System.out.println("what is the width of the rectangle");
            double width = keyboard.nextDouble();
            myRectangle = new Rectangle(length, width);
        } catch (InputMismatchException ie) {
            System.out.println("this is a letter, please enter a number");
            myRectangle = askAndCreateRectangle();
            //to recall same method as many times (recursive times)
        } catch (Exception e) {
            //calling setters control exceptions
            System.out.println(e.getMessage());
            myRectangle = askAndCreateRectangle();
        }

        //Width is not checked

        try{
            myRectangle.setWidth(-999);
        } catch (NegativeWidthException | InputMismatchException nle) {
            nle.printStackTrace();
        }

        myRectangle.setLength(40);

        return myRectangle;
    }
}
