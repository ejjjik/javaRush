package com.javarush.test;

import com.javarush.test.level03.lesson12.home01.Solution;

import java.io.BufferedReader;
//import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.Reader;


/**
 * Created by Andrew on 12.03.14.
 */
public class test
{
    public static void main(String[] args)
    {
        method1();
    }

    public static void method1()
    {
        method2();
    }

    public static void method2()
    {
        method3();
    }

    public static void method3()
    {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }

    }
}
