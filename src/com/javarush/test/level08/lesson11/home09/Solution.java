package com.javarush.test.level08.lesson11.home09;

import com.sun.org.apache.regexp.internal.recompile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       // System.out.println(isDateOdd(reader.readLine()));
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date)
    {

        SimpleDateFormat format = new SimpleDateFormat("MMM dd yyyy");
        Date yearBegin = new Date(114,0,1);
        Date dateNow = new Date(date);


        long difference = dateNow.getTime()  - yearBegin.getTime();
        long days = difference/(24*60*60*1000);

//        System.out.println(format.format(yearBegin));
//        System.out.println(format.format(dateNow));
        if(days % 2 != 0)
            return true;
        else return false;


    }
}
