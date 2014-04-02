package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Andrew on 01.04.2014.
 */
public class Earth implements Planet
{
    private static final Earth instance = new Earth();

    private Earth()
    {
    }

    public static Earth getInstance()
    {
        return instance;
    }
}
