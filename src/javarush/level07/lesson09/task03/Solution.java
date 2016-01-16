package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        ArrayList<String> list1 = new ArrayList<String>();
        Collections.addAll(list1, "мама", "мыла", "раму");

         int t = 1;

       // for (int i = 1; i < list1.size() ;i++)
       // {


            list1.add(t,"именно");
            list1.add(t + 2,"именно");
            list1.add("именно");

      //  }


        for (int i = 0; i < list1.size();i++ )
        {
            System.out.println(list1.get(i));

        }


        //напишите тут ваш код

    }
}
