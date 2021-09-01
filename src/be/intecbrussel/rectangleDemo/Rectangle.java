package be.intecbrussel.rectangleDemo;


import be.intecbrussel.rectangleDemo.Exception.NegativeLengthException;
import be.intecbrussel.rectangleDemo.Exception.NegativeWidthException;

import java.awt.event.MouseEvent;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) throws Exception {
        //to prevent duplicate recall setter than this.
        //since setter use this.length= length
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) throws NegativeLengthException {
        if (length < 0) {
            throw new NegativeLengthException();
        } else {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) throws NegativeWidthException {
        if (width < 0 ) {
            throw new NegativeWidthException("width cannot be negative");
        } else {
            this.width = width;
        }
    }


    @Override
    public String toString() {
        return "Rectangle " +
                "length= " + length + "cm  X " +
                " width= " + width +"cm";
    }
}
