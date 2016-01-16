package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         // String s = reader.readLine();
        //int x = Integer.parseInt(s);
        int sum = 0;
//Boolean exit = false;
        while (true)
        {
            String s = reader.readLine();
            if (s.equals("сумма"))
                break;
            int n = Integer.parseInt(s);
            sum = sum + n;
        }
        System.out.println(sum);

    }
}
