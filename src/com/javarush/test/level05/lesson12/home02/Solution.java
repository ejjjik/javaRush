package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{

    public static void main(String[] args)
    {
        // Создай по два объекта каждого класса тут
        Man man1 = new Man("Andrew", 24, "15-3-32");
        Man man2 = new Man("Mihail", 45, "15-3-33");

        Woman woman1 = new Woman("Larisa", 49, "15-3-33");
        Woman woman2 = new Woman("Evelina", 78, "15-3-32");

        // Выведи их на экран тут
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    // Напиши тут свои классы
    public static class Man{
        public String name = null, address = null;
        public int age = 10;

        public Man(String name){
            this.name = name;
        }
        public Man(String name, int age){
            this(name);
            this.age = age;
        }
        public Man(String name, int age, String address){
            this(name, age);
            this.address = address;
        }

    }

    public static class Woman{
        public String name = null, address = null;
        public int age = 10;

        public Woman(String name){
            this.name = name;
        }
        public Woman(String name, int age){
            this(name);
            this.age = age;
        }
        public Woman(String name, int age, String address){
            this(name, age);
            this.address = address;
        }
    }
}
