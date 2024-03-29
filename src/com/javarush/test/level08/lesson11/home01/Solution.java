package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
 Каждый кот с новой строки.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        //Написать тут ваш код. step 3 - пункт 3
        for (Cat s : cats)
        {
            cats.remove(s);
            break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        //Написать тут ваш код. step 2 - пункт 2
        Set<Cat> set = new HashSet<Cat>();

        for (int i = 0; i < 3; i++)
        {
            set.add(new Cat(i) );
        }
        return set;
    }

    public static void printCats(Set<Cat> cats)
    {
        // step 4 - пункт 4
        for (Cat s : cats)
            System.out.println(s);
    }

    // step 1 - пункт 1
    public static class Cat
    {
        public String name;
        public int count;

        public Cat(String name)
        {
            this.name = name;
        }

        public Cat(int count)
        {
            this.count = count;
        }

    }
}
