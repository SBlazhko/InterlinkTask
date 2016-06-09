package com.javarush.test.InterlinkTaskOOP;

/**
 * Created by BlazhkoS on 09.06.2016.
 */

// Cоздадим абстрактный клас фигура который будет иметь все общее что есть у каждой фигуры(методы рисовать,получить площадь, получить цвет)
abstract class AbstractFigure
{

    abstract double getArea();

    String draw(){return "The name of the figure is ";}

    String getColor(){return " color: ";}
}
