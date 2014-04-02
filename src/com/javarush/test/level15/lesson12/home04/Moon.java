package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Andrew on 01.04.2014.
 */
public class Moon implements Planet
{
    private static final Moon instance = new Moon();
    private Moon(){

    }
    public static Moon getInstance()
    {
        return instance;
    }
}
