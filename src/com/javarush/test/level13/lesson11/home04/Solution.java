package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nameFile = reader.readLine();
//        String nameFile = "C:/Users/Andrew/Desktop/1.txt";
        FileWriter file = new FileWriter(nameFile);

        String someText;

        do
        {
            file.write( (someText = reader.readLine()) + '\n');
        } while ( !"exit".equals(someText) );

        file.write("exit");
        file.close();
    }
}
