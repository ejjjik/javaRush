package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Andrew on 29.03.2014.
 */
public class MoldovanHen extends Hen
{
    String country = Country.MOLDOVA;

    @Override
    public int getCountOfEggsPerMonth()
    {
        return (int) (Math.random() * 35 + 200);
    }
    @Override
    public String getDescription()
    {
        return String.format(super.getDescription() + " Моя страна - %s. Я несу %d яиц в месяц.", country, getCountOfEggsPerMonth());
    }
}
