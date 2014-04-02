package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Напишите тут ваш код
        List<Integer> myArray = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++)
            myArray.add(Integer.parseInt(reader.readLine()));

        sort(myArray);

        for (Integer l : myArray)
            System.out.println(l);

    }

    public static void sort(List<Integer> myArray)
    {
        for (int i = 0; i < myArray.size() - 1; i++)
            for (int j = i + 1; j < myArray.size(); j++)
            {
                if (myArray.get(i) > myArray.get(j))
                {
                    myArray.set(i, myArray.get(i) + myArray.get(j));
                    myArray.set(j, myArray.get(i) - myArray.get(j));
                    myArray.set(i, myArray.get(i) - myArray.get(j));
                }
            }
    }
}
