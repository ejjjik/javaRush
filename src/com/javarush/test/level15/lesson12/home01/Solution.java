package com.javarush.test.level15.lesson12.home01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nextString = reader.readLine();

        while (!nextString.equals("exit"))
        {
            try
            {
                if (nextString.contains("."))
                {
                    print(Double.parseDouble(nextString));
                } else
                {
                    int n = Integer.parseInt(nextString);

                    if (0 < n && n < 128)
                    {
                        print((short) n);
                    } else if (n >= 128)
                    {
                        print(n);
                    } else
                    {
                        print(nextString);
                    }
                }
            }
            catch (NumberFormatException e)
            {
                print(nextString);
            }

            nextString = reader.readLine();
        }
    }

    public static void print(Double value)
    {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value)
    {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value)
    {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value)
    {
        System.out.println("Это тип Integer, значение " + value);
    }
}
