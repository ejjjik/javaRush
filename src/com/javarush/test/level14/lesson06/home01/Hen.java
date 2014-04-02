package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Andrew on 29.03.2014.
 * 1. Создать класс Hen
 1.1. Сделать его абстрактным
 1.2. Добавить в класс абстрактный метод  int getCountOfEggsPerMonth()
 1.3. Добавить в класс метод String getDescription(), который возвращает строку "Я курица."
 */
public abstract class Hen
{
    public abstract int getCountOfEggsPerMonth();
    public String getDescription()
    {
        return "Я курица.";
    }
}
