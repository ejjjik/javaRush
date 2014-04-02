package com.javarush.test.level08.lesson08.task03;

import com.sun.jndi.url.corbaname.corbanameURLContextFactory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{

    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("a","ф");
        map.put("й","в");
        map.put("ц","а");
        map.put("у","п");
        map.put("к","р");
        map.put("е","о");
        map.put("н","л");
        map.put("г","д");
        map.put("ш","я");
        map.put("щ", "ч");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        //Напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getValue().equals(name))
                count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //Напишите тут ваш код
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            if (iterator.next().getKey().equals(familiya))
                count++;
        }
        return count;


    }
}
