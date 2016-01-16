package com.javarush.test.level09.lesson02.task05;

/* Метод должен возвращать результат – глубину его стек-трейса
Написать метод, который возвращает результат – глубину его стек трейса – количество методов в нем (количество элементов в списке).
 Это же число метод должен выводить на экран.
*/

public class Solution

{
   /* public static void main(String[] args) throws Exception
{
    getStackTraceDeep();

}*/


    public static int getStackTraceDeep()
    {

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();//напишите тут ваш код
        int deep = 0;
        for (StackTraceElement element : stackTraceElements) {
            deep++;
            //System.out.println(element);
            //System.out.println(stackTraceElements[1]);
        }
        System.out.println(deep);
        return deep;
    }
}
