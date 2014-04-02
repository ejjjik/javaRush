package com.javarush.test.level14.lesson08.home02;

/* Дегустация вин

4. Написать реализацию методов getDeliciousDrink, getWine, getBubblyWine
5. Каждый класс и интерфейс должны быть в отдельных файлах
6. Метод main менять нельзя!
*/

public class Solution
{
    public static void main(String[] args)
    {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink()
    {
        return new Drink()
        {
            @Override
            public void taste()
            {
                super.taste();
            }
        };
    }

    public static Wine getWine()
    {
        return new Wine();

    }

    public static Wine getBubblyWine()
    {
        return new BubblyWine();
    }
}
