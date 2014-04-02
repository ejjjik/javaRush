package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashSet<Integer> set = createSet();
        print(set);
        removeAllNumbersMoreThen10(set);
        System.out.println();
        print(set);

    }

    public static HashSet<Integer> createSet()
    {
        //Напишите тут ваш код
        HashSet<Integer> setInt = new HashSet<Integer>();

        for (int i = 0; i < 20; i++)
            setInt.add(i);

        return setInt;

    }

    public static HashSet<Integer> removeAllNumbersMoreThen10(HashSet<Integer> set)
    {
        //Напишите тут ваш код
        Iterator<Integer> i = set.iterator();
        while (i.hasNext())
        {
            if (i.next() > 10)
                i.remove();
        }

        return set;

    }

    public static void print(HashSet<Integer> set)
    {
        for (Integer i : set)
            System.out.print(i + " ");
    }
}
