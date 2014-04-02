package com.javarush.test.level08.lesson11.bonus01;

import com.sun.org.apache.regexp.internal.recompile;
import org.omg.DynamicAny._DynStructStub;

import java.beans.Expression;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Номер месяца
Программа вводит с клавиатуры имя месяца
и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //add your code here - напиши код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(print(reader.readLine()));

    }

    public static String print(String date)
    {
        List<String> months = new ArrayList<String>();

        months.add( "January" );
        months.add( "February" );
        months.add( "March" );
        months.add( "April" );
        months.add( "May" );
        months.add( "June" );
        months.add( "July" );
        months.add( "August" );
        months.add( "September" );
        months.add( "October" );
        months.add( "November" );
        months.add( "December" );

        String text = date + " is " + (months.indexOf(date) + 1) + " month";

        return text;
    }

}
