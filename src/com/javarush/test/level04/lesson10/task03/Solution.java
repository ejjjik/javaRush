package com.javarush.test.level04.lesson10.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int number = scanner.nextInt();

        while (number-- > 0)
            System.out.println(str);

    }
}
