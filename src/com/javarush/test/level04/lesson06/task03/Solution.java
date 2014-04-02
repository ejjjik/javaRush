package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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

        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();


        int min = min(min(a, b), c);
        int max = max(max(a, b), c);
        int average = average(min, max, a, b, c);


        System.out.print(max + " " + average + " " + min);
    }

    public static int average(int min, int max, int a, int b, int c){
        if (a < max && a > min)
            return a;
        if (b < max && b > min)
            return b;
        return c;
    }

    public static int min(int a, int b){
        if (a < b){
            return a;
        }
        return b;
    }

    public static int max(int a, int b){
        if (a > b){
            return a;
        }
        return b;
    }
}
