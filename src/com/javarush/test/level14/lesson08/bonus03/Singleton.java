package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Andrew on 29.03.2014.
 * 1. Создай класс Singleton в отдельном файле.
 * 2. Добавь в него статический метод getInstance().
 * 3. Метод getInstance должен возвращать один и тот же объект класса Singleton при любом вызове метода getInstance.
 * 4. Подумай, каким образом можно запретить создание других объектов этого класса.
 * 5. Сделай все конструкторы в классе Singleton приватными (private).
 */
public class Singleton
{
    private static Singleton singleton;
    private Singleton()
    {
    }

    public static Singleton getInstance()
    {
        if (singleton != null)
            singleton = new Singleton();
        return singleton;
    }
}
