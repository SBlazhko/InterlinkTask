package com.javarush.test.InterlinkTaskOOP;

/**
 * Created by BlazhkoS on 09.06.2016.
 */
public class Square extends AbstractFigure
{
    private double sideA;
    private String color;

    public Square(double sideA, String color)
    {
        this.sideA = sideA;
        this.color = color;
    }

    private double sideLength(){return sideA;}

    public double getSideLength(){return sideLength();}

    @Override
    double getArea()
    {
        return sideA * sideA;
    }

    @Override
    public String draw()
    {
        return super.draw() + getClass().getSimpleName() + ", area: " + getArea() + " sq. m." + ", side length: " + getSideLength() + "," + getColor();
    }

    @Override
    public String getColor()
    {
        return super.getColor() + this.color;
    }
}
