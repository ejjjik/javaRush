package com.javarush.test.level08.lesson08.task05;

import com.javarush.test.level06.lesson08.task05.StringHelper;
import org.omg.DynamicAny._DynStructStub;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>)
занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("q", "a");
        map.put("w", "s");
        map.put("e", "d");
        map.put("r", "a");
        map.put("t", "a");
        map.put("y", "a");
        map.put("u", "s");
        map.put("i", "d");
        map.put("o", "s");
        map.put("p", "x");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            int count = 0;
            for (Map.Entry<String, String> m : map.entrySet())
            {
                if (m.getValue().equals(pair.getValue()))
                {
                    count++;
                }
            }

            if (count > 1)
            {
                removeItemFromMapByValue(map, pair.getValue());
                iterator = map.entrySet().iterator();
            }
        }

    }


    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) throws Exception
    {
        HashMap<String, String> map = createMap();
        print(map);
        removeTheFirstNameDuplicates(map);
        System.out.println("______________");
        print(map);

    }

    public static void print(HashMap<String, String> map)
    {
        for (Map.Entry<String, String> m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
    }
}
