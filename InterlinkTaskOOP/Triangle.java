package com.javarush.test.InterlinkTaskOOP;

/**
 * Created by BlazhkoS on 09.06.2016.
 */
public class Triangle extends AbstractFigure
{
   private double sideA;
   private double sideB;
   private String color;

    public Triangle(double sideA, double sideB, String color)
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    private double hypotenuse(){
        double h = Math.sqrt((sideA * 2) + (sideB * 2));
        return h * 2;
    }

    public double getHypotenuse(){return hypotenuse();}

    @Override
    public double getArea()
    {
        return  0.5 * sideA * sideB;
    }

    @Override
    public String draw()
    {
        return super.draw() + getClass().getSimpleName() + ", area: " + getArea() + " sq. m." + ", hypotenuse size: " + getHypotenuse() + "," + getColor();
    }

    @Override
    public String getColor()
    {
        return super.getColor() + this.color;
    }
}
