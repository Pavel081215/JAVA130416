package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String q = reader.readLine();
        String w = reader.readLine();
        String e = reader.readLine();
        String r = reader.readLine();
        int a = Integer.parseInt(q);
        int s = Integer.parseInt(w);
        int d = Integer.parseInt(e);
        int f = Integer.parseInt(r);

        if (a > s && a > d && a > f )
        {System.out.println(a); }
        if (s > a && s > d && s > f )
        {System.out.println(s); }
        if (d > a && d > s && d > f )
        {System.out.println(d); }
        if (f > a && f > s && f >d )
        {System.out.println(f); }




    }
}