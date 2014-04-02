package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        int age;
        String name;
        String surname;
        boolean sex;
        int hands;
        int legs;

        public Human(){}
        public Human(int age){ this.age = age;}
        public Human(int age, String name){this(age); this.name = name;}
        public Human(int age, String name, String surname){this(age, name); this.surname = surname;}
        public Human(int age, boolean sex){this(age); this.sex = sex;}
        public Human(int age, String name, boolean sex){this(age, name); this.sex = sex;}
        public Human(int age, String name, String surname, boolean sex){this(age, name, surname);this.sex = sex;}
        public Human(int age, String name, boolean sex, int hands){this(age, name, sex); this.hands = hands;}
        public Human(int age, String name, boolean sex, int hands, int legs){this(age, name, sex, hands);this.legs = legs;}
        public Human(int age, String name, String surname, boolean sex, int hands, int legs){this(age, name, sex, hands, legs);this.surname = surname;}
    }
}
