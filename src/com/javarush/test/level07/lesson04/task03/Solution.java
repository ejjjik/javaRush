package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
qwe
asdewr
werf
qew
asdasf
asdasd
asd
retert
re
ret
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк,
индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static final int LENGTH_ARRAY = 10;
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        String[] strArray = myArray();
        int[] intArray = new int[LENGTH_ARRAY];

        for (int i = 0; i < strArray.length; i++)
        {
            intArray[i] = strArray[i].length();
        }

        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }


    }

    public static String[] myArray() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strArray = new String[LENGTH_ARRAY];
        for (int i = 0; i < LENGTH_ARRAY; i++)
        {
            strArray[i] = reader.readLine();
        }
        return strArray;
    }

}
