package com.javarush.test.level09.lesson02.task05;

/* Метод должен возвращать результат – глубину её стек-трейса
Написать метод, который возвращает результат –
глубину его стек трейса – количество методов в нем
(количество элементов в списке). Это же число метод должен выводить на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        getStackTraceDeep();
    }
    public static int getStackTraceDeep()
    {
        //Напишите тут ваш код
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        int number = stackTraceElement.length;
        System.out.println(number);

//        int count = 0;
//        for (StackTraceElement stackTraceElement1 : stackTraceElement)
//            count++;
//
//        System.out.println(count);

        return number;
    }
}
