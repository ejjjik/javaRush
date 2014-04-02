package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    public String name;
    public int age;
    public char sex;
    //Напишите тут ваш код
    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, int age){
        initialize(name);
        this.age = age;
    }
    public void initialize(String name, int age, char sex){
        initialize(name, age);
        this.sex = sex;
    }

}
