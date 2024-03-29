package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dateIn = reader.readLine();

        SimpleDateFormat format = new SimpleDateFormat("MM/dd/y");

//        Calendar calendar = new GregorianCalendar(year - 1, month, day);
//        System.out.println(format.format(calendar.getTime()));

        Date date = format.parse(dateIn);

        format = new SimpleDateFormat("MMM dd, y", Locale.ENGLISH);

        System.out.println(format.format(date).toUpperCase());

    }
}
