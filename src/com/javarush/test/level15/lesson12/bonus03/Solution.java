package com.javarush.test.level15.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/* Факториал
Написать метод, который вычисляет факториал - произведение всех чисел от 1 до введенного числа включая его.
Пример: 4! = factorial(4) = 1*2*3*4 = 24
1. Ввести с консоли число меньше либо равно 150.
2. Реализовать функцию  factorial.
3. Если введенное число меньше 0, то вывести 0.
0! = 1
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        try
        {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//            int input = Integer.parseInt(reader.readLine());
            int input = 150;
            reader.close();

            System.out.println(factorial(input));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    public static String factorial(int n) throws IllegalArgumentException
    {
        //add your code here
        BigInteger fact = BigInteger.ONE;

        if (n > 150)
        {
            throw new IllegalArgumentException();
        }
        if (n < 0)
        {
            return 0 + "";
        }

        while (n > 1)
        {
            fact = fact.multiply(BigInteger.valueOf(n--));
        }
        return fact.toString();
    }
}
