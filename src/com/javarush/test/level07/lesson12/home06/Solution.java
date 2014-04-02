package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String),
пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось:
Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human,
то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
//        Два дедушки, две бабушки, отец, мать, трое детей.
//            Вывести объекты на экран.


        Human grandFather1 = new Human("gF1", true, 66, null, null);
        Human grandFather2 = new Human("gF2", true, 67, null, null);
        Human grandMother1 = new Human("gM1", false, 66, null, null);
        Human grandMother2 = new Human("gM2", false, 67, null, null);
        Human father = new Human("f", true, 46, grandFather1, grandMother1);
        Human mother = new Human("m", false, 47, grandFather2, grandMother2);
        Human child1 = new Human("ch1", true, 23, father, mother);
        Human child2 = new Human("ch2", false, 24, father, mother);
        Human child3 = new Human("ch3", false, 26, father, mother);

        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

    }

    public static class Human
    {
        //Написать тут ваш код
        String name;
        Boolean sex;
        int age;
        Human mother, father;

//        public Human(String name, Boolean sex, int age)
//        {
//            this.name = name;
//            this.sex = sex;
//            this.age = age;
//        }

        public Human(String name, Boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
