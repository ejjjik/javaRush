package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by Andrew on 01.04.2014.
 */
public class Plane implements Flyable
{
    private int numbersOfPassangers;

    public Plane(int numbersOfPassangers)
    {
        this.numbersOfPassangers = numbersOfPassangers;
    }

    @Override
    public void fly()
    {

    }
}
