package com.javarush.test;

import java.util.ArrayList;

/**
 * Created by BlazhkoS on 09.06.2016.
 */
//Создать метод который возвращает ряд фибоначи до заданого числа списком или масивом
public class InterlinkTask4
{
    public static void main(String[] args)
    {
        ArrayList<Long> list = new ArrayList<>();
        fib(list, 24);

        for (Long i : list) { System.out.println(i); }
    }


    public static ArrayList<Long> fib(ArrayList<Long> list, int n)
    {
        long a = 1;
        long b = 1;
        long sumF = 1;
        if (n == 1)
        {
            list.add(a);
            return list;
        } else if (n == 2)
        {
            list.add(a);
            list.add(a + a);
            return list;
        } else
        {
            list.add(a);list.add(a);
            for (int i = 0; i < n; i++)
            {
                sumF = a + b;
                a = b;
                b = sumF;
                list.add(sumF);
            }
            return list;
        }
    }

}
