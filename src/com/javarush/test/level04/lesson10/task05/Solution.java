package com.javarush.test.level04.lesson10.task05;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while. Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int i = 0, j = 0;

        while (i++ < 10){
            while (j++ < 10)
                System.out.print( j * i + " " );
            System.out.println();
            j = 0;
        }




    }
}
