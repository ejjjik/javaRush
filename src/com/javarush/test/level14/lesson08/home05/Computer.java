package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Andrew on 29.03.2014.
 *
 6. В класс Computer добавь приватное поле типа Keyboard.
 7. В класс Computer добавь приватное поле типа Mouse.
 8. В класс Computer добавь приватное поле типа Monitor.
 9. Создай конструктор в классе Computer используя комбинацию клавиш Alt+Insert внутри класса (команда Constructor).
 10 Внутри конструктора инициализируйте все три поля (переменных) класса
 11. Создай геттеры для полей класса Computer (в классе используй комбинацию клавиш Alt+Insert и выбери команду Getter).
 */
public class Computer
{
    private Keyboard keyboard = new Keyboard();
    private Mouse mouse = new Mouse();
    private Monitor monitor = new Monitor();


    public Computer()
    {
    }

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor)
    {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public Keyboard getKeyboard()
    {
        return keyboard;
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public Monitor getMonitor()
    {
        return monitor;
    }
}
