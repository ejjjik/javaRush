package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Andrew on 29.03.2014.
 */
public class RussianHen extends Hen
{
    String country = Country.RUSSIA;
    @Override
    public int getCountOfEggsPerMonth()
    {
        return (int) (Math.random() * 45 + 260);
    }
    @Override
    public String getDescription()
    {
        return String.format(super.getDescription() + " Моя страна - %s. Я несу %d яиц в месяц.", country, getCountOfEggsPerMonth());
    }
}
