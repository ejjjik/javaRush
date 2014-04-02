package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть закрыть файл и поток.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
//        String fileName = "C:/Users/Andrew/Desktop/1.txt";

        FileReader file = new FileReader(fileName);
        reader = new BufferedReader(file);

        String tmp;

        while ( (tmp = reader.readLine()) != null )
        {
            System.out.println(tmp);
        }

        reader.close();
        file.close();

    }
}
