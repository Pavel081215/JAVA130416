package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        for (int q = 0; q < n; q++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (int q = 0; q < m; q++) {
            //int f = );

            list.add(list.get(0));

            list.remove(0);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        // /напишите тут ваш код
    }
}
