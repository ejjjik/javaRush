package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //Напишите тут ваш код
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < 20; i++)
            set.add("Л" + i);
//        set.add("Любовь");
//        set.add("Лиза");
//        set.add("Линда");
//        set.add("Лаванда");
//        set.add("Лето");
//        set.add("Лом");
//        set.add("Литр");
//        set.add("Либидо");
//        set.add("Лимита");
//        set.add("Лес");
//        set.add("Лесоруб");
//        set.add("Линейка");
//        set.add("Логарифм");
//        set.add("Лайкра");
//        set.add("Лямбда");
//        set.add("Люстра");
//        set.add("Лоза");
//        set.add("Лаванда");
//        set.add("Лира");
//        set.add("Лонжерон");


        return set;

    }
}
