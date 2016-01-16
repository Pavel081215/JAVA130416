package com.javarush.test.level08.lesson06.task02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Провести 10 тысяч вставок, удалений
Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list)
    {
        int e = 0;
        for (int q = 0; q < 10000; q ++)
        {
            list.add(0, q);
            e++;
        }//напишите тут ваш код
        System.out.println("add" + e);
    }

    public static void get10000(List list)
    {
        int e = 0;
        for (int q = 0; q < list.size(); q ++)
        {
            list.get(q);
            e++;
        }
        System.out.println("get" + e);
    }

    public static void set10000(List list)
    {
        int e = 0;
        for (int q = 0; q < list.size(); q ++)
        {
            list.set(q, q);
            e++;
        }
        System.out.println("set" + e);//напишите тут ваш код

    }

    public static void remove10000(List list)
    {
        int e = 0;
        for (int q = 0; q < list.size(); )
        {
            list.remove(0);

            e++;
        }
        System.out.println("remove" + e);//н//напишите тут ваш код

    }
}
