package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        System.out.println("1 етап");

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        System.out.println("2 етап");

        removeCats(pets, cats);

        System.out.println("3 етап");
        printPets(pets);


    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();

        result.add(new Cat("10"));
        result.add(new Cat("20"));
        result.add(new Cat("30"));
        result.add(new Cat("40"));
        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs()
    {
        HashSet<Dog> resultD = new HashSet<Dog>();

        resultD.add(new Dog("100"));
        resultD.add(new Dog("200"));
        resultD.add(new Dog("300"));
         //напишите тут ваш код


        return resultD;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        HashSet<Object> resultDC = new HashSet<Object>();


        resultDC.addAll(cats);
        resultDC.addAll(dogs);

        return resultDC;
    }





    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        pets.removeAll(cats);


        /*//  Iterator<Object> iterator = pets.iterator();
        //Iterator<Object> iterator = cats.iterator();

        //  while (iterator.hasNext())
        for (Object f : cats)
        {
            Iterator<Object> iterator = pets.iterator();

            while (iterator.hasNext())
            {
                if (f.equals(iterator.next()))
                {
                    pets.remove(iterator.next());
                }
            }
        }*/
    }







    public static void printPets(Set<Object> pets)
    {
        Iterator<Object> iterator = pets.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()); }//напишите тут ваш код
    }
    public static class  Cat
    {
        String name;
        public  Cat(String name)
        {
            this.name = name;
        }
    }
    public static class  Dog
    {
        String name;
        public  Dog (String name)
        {
            this.name = name;
        }
    }

}
