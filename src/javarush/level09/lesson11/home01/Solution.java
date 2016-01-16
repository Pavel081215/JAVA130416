package com.javarush.test.level09.lesson11.home01;

/* Деление на ноль
Создай метод public static void divisionByZero, в котором подели любое число на ноль и выведи на экран результат деления.
Оберни вызов метода divisionByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()
*/

public class Solution
{

    public  void main(String[] args)
    {
        try
        {
            divisionByZero();
        }
        catch (Exception e)
        {
           e.printStackTrace();
        }
    }

    public String divisionByZero() throws Exception
    {
        String a = "3";

       // a = a / 0;


        return a;
    }

}