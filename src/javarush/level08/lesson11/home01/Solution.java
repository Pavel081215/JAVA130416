package com.javarush.test.level08.lesson11.home01;

import org.omg.CORBA.*;

import java.lang.Object;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        Iterator<Cat> iterator = cats.iterator();

       // cats.remove(0);
        ///iterator.hasNext();
        cats.remove(iterator.next());

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        Set<Cat> create = new HashSet<Cat>();
        create.add(new Cat("Васька"));
        System.out.println();
        create.add(new Cat("Борька"));
        create.add(new Cat("Колька"));
        System.out.println("Созданы");
        //напишите тут ваш код. пункт 2
        return  create;
    }

    public static void printCats(Set<Cat> cats)
    {
        for ( Object q : cats)
        {
            System.out.println(q);
            System.out.println("Печатаються");
        }
    }

    public static class Cat
    {
      String name;
        public Cat (String name)
        {
            this.name = name;
        }


    }

    // пункт 1
}
