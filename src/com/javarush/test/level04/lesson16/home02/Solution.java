package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int min = border(border(a, b, true), c, true);
        int max = border(border(a, b, false), c, false);

        if ( a != min && a != max)
            System.out.print(a);
        if ( b != min && b != max)
            System.out.print(b);
        if ( c != min && c != max)
            System.out.print(c);



    }

    public static int border(int a, int b, boolean indication){
        if ((a < b) == indication)
            return a;
        return b;
    }
}
