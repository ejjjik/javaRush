 package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке.
Каждый элемент - с новой строки.
*/

public class Solution
{
    final static int LENGTH_ARRAY = 10;
    final static int LENGTH_INPUT = 8;

    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        String[] myArray = initAray();
        outArray(myArray);

    }
    public static String[] initAray() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] myArray = new String[LENGTH_ARRAY];
        for (int i = 0; i < LENGTH_INPUT; i++){
            myArray[i] = reader.readLine();
        }
        return myArray;
    }

    public static void outArray(String[] myArray) throws Exception
    {
        for (int i = myArray.length - 1; i >= 0; i-- )
        {
            System.out.println(myArray[i]);
        }
    }

}