package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String),
    пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так,
    чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        final boolean MAN = true;
        final boolean WOOMAN = false;

        //Написать тут ваш код
        Human[] humans = new Human[9];
        ArrayList<Human> family = new ArrayList<Human>();

        humans[0] = new Human("ch1", MAN, 10);
        humans[1] = new Human("ch2", WOOMAN, 11);
        humans[2] = new Human("ch3", MAN, 9);

        family.add(humans[0]);
        family.add(humans[1]);
        family.add(humans[2]);

        humans[3] = new Human("m2", WOOMAN, 10, family);
        humans[4] = new Human("f1", MAN, 10, family);
        family = new ArrayList<Human>();
        family.add(humans[4]);

        humans[5] = new Human("gf1", MAN, 10, family);
        humans[6] = new Human("gm1", WOOMAN, 10, family);
        family = new ArrayList<Human>();
        family.add(humans[3]);

        humans[7] = new Human("gf2", MAN, 10, family);
        humans[8] = new Human("gm2", WOOMAN, 10, family);

        for (Human s : humans)
            System.out.println(s);

    }

    public static class Human
    {
        //Написать тут ваш код
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this(name, sex, age);
            this.children.addAll(children);
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
