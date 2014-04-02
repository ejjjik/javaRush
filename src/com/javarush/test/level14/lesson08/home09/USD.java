package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Andrew on 30.03.2014.
        5. В отдельном файле создай класс USD.
        6. Наследуй класс USD от класса Money.
        7. В классе USD реализуй метод getCurrencyName, который возвращает "USD".
        8. Подумай, объекты каких классов можно добавить в список(лист) allMoney.
        9. Добавь в конструктор класса Person заполнение листа allMoney объектами всех возможных классов.
 */
public class USD extends Money
{
    public USD(double amount)
    {
        super(amount);
    }

    @Override
    public String getCurrencyName()
    {
        return "USD";
    }
}
