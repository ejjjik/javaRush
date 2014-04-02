package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //Напишите тут ваш код
    public String name = null;
    public int height = 100;
    public String color;

    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, int height){
        initialize(name);
        this.height = height;
    }
    public void initialize(String name, int height, String color){
        initialize(name, height);
        this.color = color;
    }


}
