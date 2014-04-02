package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by Andrew on 01.04.2014.
 * 1. В отдельном файле создать класс DrinkMaker с тремя абстрактными методами:
 * - void getRightCup() - выбрать подходящую чашку
 * - void putIngredient() - положить ингредиенты
 * - void pour() - залить жидкостью
 * 2. В классе DrinkMaker создать и реализовать метод void makeDrink(),
 * который готовит напиток в такой последовательности: выбирает чашку, кладет ингредиенты, заливает жидкостью.
 */
public abstract class DrinkMaker
{
    abstract void getRightCup();    //- выбрать подходящую чашку
    abstract void putIngredient();  //- положить ингредиенты
    abstract void pour();           // - залить жидкостью

    void makeDrink()
    {
        getRightCup();
        putIngredient();
        pour();
    }
}
