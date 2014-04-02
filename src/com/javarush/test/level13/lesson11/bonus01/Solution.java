package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        String fileName = reader.readLine();//"C:/Users/Andrew/Desktop/1.txt";

        InputStream fileToSort = new FileInputStream(fileName);

//        while (fileToSort.available() > 0)
//        {
//            list.add(fileToSort.read());
//        }
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        while (reader.ready())
        {
            list.add(Integer.parseInt(reader.readLine()));
        }

        fileToSort.close();

//        list.add(5);
//        list.add(8);
//        list.add(11);
//        list.add(3);
//        list.add(2);
//        list.add(10);

        sort(list, true);
        print(list);

    }

    public static void print(ArrayList<Integer> list)
    {
        for (Integer i : list)
            System.out.println(i);
    }

    public static void sort(ArrayList<Integer> list, boolean chet)
    {
        if (chet)
            removeNech(list);

        for (int i = 0; i < list.size() - 1; i++)
        {
            for (int j = i + 1; j < list.size(); j++)
            {
                if (list.get(i) > list.get(j))
                {
                    list.set(i, list.get(i) + list.get(j));
                    list.set(j, list.get(i) - list.get(j));
                    list.set(i, list.get(i) - list.get(j));
                }
            }
        }
    }

    public static void removeNech(ArrayList<Integer> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) % 2 != 0)
            {
                list.remove(i);
                i--;
            }
        }
    }
}
