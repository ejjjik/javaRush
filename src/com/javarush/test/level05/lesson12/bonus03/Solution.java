package com.javarush.test.level05.lesson12.bonus03;

import com.sun.swing.internal.plaf.metal.resources.metal_it;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        //напишите здесь ваш код
        int n = Integer.parseInt(reader.readLine());
        if (n != 1)
        {
            maximum = Integer.parseInt(reader.readLine());
            while (--n > 0)
            {
                maximum = min(maximum, Integer.parseInt(reader.readLine()));
            }
        } else
        {
            maximum = Integer.parseInt(reader.readLine());
        }


        System.out.println(maximum);
    }

    public static int min(int a, int b)
    {
        return a > b ? a : b;
    }

}
