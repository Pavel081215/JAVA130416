package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        int[] q = new int[20];

        for (int i = 0; i < q.length; i++)
        { q[i] = Integer.parseInt(reader.readLine()); }

        int  maximum = q[0];
        int  minimum = q[0];

        for (int i = 0; i < q.length; i++)
        {
           if(maximum < q[i])
           {maximum = q[i]; }
        }

        for (int i = 0; i < q.length; i++)
        {
            if(minimum > q[i])
            {minimum = q[i]; }
        }

        //напишите тут ваш код


        System.out.println(maximum + " " + minimum);
        //System.out.println(minimum);
    }
}
