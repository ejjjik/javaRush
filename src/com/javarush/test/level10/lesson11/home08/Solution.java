package com.javarush.test.level10.lesson11.home08;

import com.javarush.test.level06.lesson08.task05.StringHelper;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести на их экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //Напишите тут ваш код
        ArrayList<String>[] arrayOfStringList = new ArrayList[5];
        for (int i = 0; i < arrayOfStringList.length; i++)
        {
            arrayOfStringList[i] = new ArrayList<String>();
            arrayOfStringList[i].add("some text + " + i);
        }

        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list : arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}