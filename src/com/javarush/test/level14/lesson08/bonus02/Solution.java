package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));

        int a, b;
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());

        System.out.println(nod(a, b));

    }

    public static int nod(int a, int b)
    {
        while (b != 0)
        {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
