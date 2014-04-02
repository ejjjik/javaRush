package com.javarush.test.level03.lesson12.home01;

/* Жить хорошо, а хорошо жить еще лучше
Вывести на экран надпись «Жить хорошо, а хорошо жить еще лучше»
*/

import java.util.Scanner;

public class Solution
{
    private static String name;
    public static void main(String[] args)
    {
        //Напишите тут ваш код
       setName("anna");
        System.out.print(name);
    }

    public static void setName(String name) {
        //add your code here
       Solution.name = name;
    }
}

    /**
private String name;

    public String main(String[] args){
        Cat.this.setName("test");
        return name;
    }

    public void setName(String name) {
        //add your code here
        Cat.this.name = name;
    }

     */