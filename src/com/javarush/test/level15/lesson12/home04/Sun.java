package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Andrew on 01.04.2014.
 */
public class Sun implements Planet
{
    private static final Sun instance = new Sun();

    private Sun()
    {
    }

    public static Sun getInstance()
    {
        return instance;
    }
}
