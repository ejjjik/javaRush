package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);

        //int a = reader.read();
        //int b = reader.read();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        //System.out.print(a);

        System.out.print(min(a, b));

    }

    public static int min(int a, int b){
        if (a < b)
            return a;
        return b;
    }
}