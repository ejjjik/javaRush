package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //Напишите тут ваш код
    public int centerX = 0, centerY = 0, radius = 0, width = 0;
    public String color;

    public void initialize(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public void initialize(int centerX, int centerY, int radius, int width){
        initialize(centerX, centerY, radius);
        this.width = width;
    }
    public void initialize(int centerX, int centerY, int radius, int width, String color){
        initialize(centerX, centerY, radius, width);
        this.color = color;
    }


}
