package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(reader.readLine());
        int w = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        int r = Integer.parseInt(reader.readLine());
        int t = Integer.parseInt(reader.readLine());
        int as;
        if (q < w) // какая больше q или w
        {
            as = q;
            q = w;
            w =as;
        }





        if (q > e && e > w) // какая больше (q и  w ) или e
        {
            as = w;
            w = e;
            e = as;
        }
        else
        {
            if(q < e)
            {
             as = q;
             q = e;
             e = w;
             w = as;
            }
         }







        if (q > r && r > e) // какая больше (q и w и e  ) или r
        {
            if ( r > w )
            {
                as = w;
                w = r;
                r = e;
                e = as;

            }
            else
            {
                as = e;
                e = r;
                r = as;
            }
        }
        else
        {
            if (r > q)
            {
                as = r;
                r = e;
                e = w;
                w = as;
            }

        }
        if (q > t && t > r) // какая больше (q и w и e и r ) или t
        {
            if (t > w)
            {
              as = t;
              t = r;
              r = e ;
              e = w;
              w = as;
            }
            else
            {
                if ( t > e)
                {
                  as = t;
                    t = r;
                    r = e ;
                    e = as;

                }
                else
                {
                    as = t;
                    t = r;
                    r = as;

                }
            }
        }

        System.out.println( q + "  "  +  w  +  "   " + e + "  "  + r + "  " + t);

    }










        //напишите тут ваш код

}
