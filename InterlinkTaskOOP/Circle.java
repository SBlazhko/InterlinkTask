package com.javarush.test.InterlinkTaskOOP;

/**
 * Created by BlazhkoS on 09.06.2016.
 */
public class Circle extends AbstractFigure
{
    private double diameter;
    private String color;

    Circle(double diameter, String color)
    {
        this.diameter = diameter;
        this.color = color;
    }

    private double radius(){return diameter / 2;}

    public double getRadius(){return radius();}

    @Override
    double getArea()
    {
        return 3.14 * (getRadius()*2);
    }

    @Override
    public String draw()
    {
        return super.draw() + getClass().getSimpleName() +  ", area: " + getArea() + " sq. m." + ", radius: " + getRadius() + "," + getColor();
    }

    @Override
    public String getColor()
    {
        return super.getColor() + this.color;
    }
}
