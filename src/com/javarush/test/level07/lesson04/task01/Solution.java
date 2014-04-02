package com.javarush.test.level07.lesson04.task01;

import com.sun.jndi.url.iiop.iiopURLContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
        //initialize(create and fill) an array here - инициализируйте (создайте и заполните) массив тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] myArray = new int[20];
        //int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3};
        for (int i = 0; i < 20; i++){
            myArray[i] = Integer.parseInt(reader.readLine());
        }
        return myArray;
    }

    public static int max(int[] array) {
        //find the max value here - найдите максимальное значение в этом методе
        int max = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }
}
