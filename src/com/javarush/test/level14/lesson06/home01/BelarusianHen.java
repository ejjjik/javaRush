package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Andrew on 29.03.2014.
 * 7. В каждом из четырех последних классов написать свою реализацию метода getDescription.
 Методы должны возвращать строку вида:
 <getDescription() родительского класса>  + <" Моя страна - SSSSS. Я несу N яиц в месяц.">
 где SSSSS - название страны
 где N - количество яиц в месяц
 */
public class BelarusianHen extends Hen
{
    String country = Country.BELARUS;
    @Override
    public int getCountOfEggsPerMonth()
    {
        return (int) (Math.random() * 35 + 270);
    }

    @Override
    public String getDescription()
    {
        return String.format(super.getDescription() + " Моя страна - %s. Я несу %d яиц в месяц.", country, getCountOfEggsPerMonth());
    }
}
