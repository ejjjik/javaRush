package com.javarush.test.level09.lesson06.task01;

/* Исключение при работе с числами
Перехватить исключение (и вывести его на экран),
указав его тип, возникающее при выполнении кода:
int a = 42 / 0;
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        try
        {
            int a = 42 / 0;
        }
        //Напишите тут ваш код
        catch (NullPointerException e)
        {
            System.out.println("(NPE) Divizen by zero: " + e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
