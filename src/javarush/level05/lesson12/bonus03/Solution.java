package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            maximum = Integer.parseInt(reader.readLine());
            for (int x = 0; x < n - 1; x++) {
                int s = Integer.parseInt(reader.readLine());
                if (s > maximum) maximum = s;
            }

        }
        if (maximum == 0) {
            maximum = 1;
        }
        System.out.println(maximum);
    }
}
