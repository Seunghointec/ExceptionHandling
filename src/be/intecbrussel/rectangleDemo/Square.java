package be.intecbrussel.rectangleDemo;

import be.intecbrussel.rectangleDemo.Exception.NegativeLengthException;
import be.intecbrussel.rectangleDemo.Exception.NegativeWidthException;

public class Square extends Rectangle{
    public Square(double length, double width) throws Exception {
        super(length, width);
    }

    @Override
    public void setLength(double length) throws NegativeLengthException {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) throws NegativeWidthException {
        super.setWidth(width);
        super.setLength(width);
    }
}
