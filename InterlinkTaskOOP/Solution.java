package com.javarush.test.InterlinkTaskOOP;

import java.util.HashSet;

/**
 * Created by BlazhkoS on 09.06.2016.
 */
/*
Условие задачи:
Допустим нам нужно написать программу которая создает фигуры. Фигуры могут быть квадрат, треугольник, круг и т.д..
Допустим в каждой фигуры есть общие методы, фигуру можно нарисовать, получить ее площадь и цвет.
Также фигуры имеют уникальные методы, например: вернуть радиус, длину гипотенузы, длину стороны и т. д.
Пример отрисовки фигуры: "Фигура: круг, площадь: 25 кв. ед., радиус 10, цвет: красный"

Реализация ООП:
Наследование
Создадим абстрактный клас фигура и напишем в нём общиие методы некоторые реализуем. Потом создадим классы квадрат, треугольник, круг и
наследуемся от класа Фигура. В новых класах переопредилим методы базового класса и добавим в них новую функциональность.

Инкапсуляция
Каждая фигура будет иметь уникальный private метод(вернуть радиус, длину гипотенузы, длину стороны)
реализация которого будет закрыта для других класов а значения можно будет получить только в составе открытых методов
или отдельно с помощю гет метода этого метода.

Полиморфизм
Полиморфизм будет продемонстрирован методом draw() который будет рисовать переданый обект.
Мы поместим все обекты в множество Set и вызовим метод draw() для каждого.
Программа сама оприделит какой нужен метод для какого обекта.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashSet<AbstractFigure> set = new HashSet<>();
        set.add(new Circle(4, "green"));
        set.add(new Square(12, "yellow"));
        set.add(new Triangle(13, 12, "orange"));

        for (AbstractFigure a : set)
        {
            System.out.println(a.draw());
        }


    }
}