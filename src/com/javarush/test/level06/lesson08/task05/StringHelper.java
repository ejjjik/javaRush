package com.javarush.test.level06.lesson08.task05;

/* Класс StringHelper
Cделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) – возвращает строку повторенную count раз.
String multiply(String s) – возвращает строку повторенную 5 раз.
Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго
*/

public class StringHelper
{
    public static String multiply(String s)
    {
        //Напишите тут ваш код
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < 5; i++)
            sb.append(s);
        return sb.toString();
    }

    public static String multiply(String s, int count)
    {
        StringBuffer sb = new StringBuffer("");
        for (;count > 0; count--)
            sb.append(s);
        return sb.toString();
    }
}
