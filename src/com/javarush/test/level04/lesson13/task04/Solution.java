package com.javarush.test.level04.lesson13.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем линии
Используя цикл for вывести на экран:
-	горизонтальную линию из 10 восьмёрок
-	вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        final int NUMBERS = 10;

        for (int i = 0; i < NUMBERS; i++){
            System.out.print(8);
        }
        System.out.println();
        for (int i = 0; i < NUMBERS; i++){
            System.out.println(8);
        }


    }
}
