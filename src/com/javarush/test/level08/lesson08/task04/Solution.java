package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей
по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("й", new Date("SEPTEMBER 1 1980"));
        map.put("ц", new Date("JUNE 1 1980"));
        map.put("у", new Date("JUNE 1 1980"));
        map.put("к", new Date("SEPTEMBER 1 1980"));
        map.put("е", new Date("JUNE 1 1980"));
        map.put("н", new Date("SEPTEMBER 1 1980"));
        map.put("г", new Date("JUNE 1 1980"));
        map.put("ш", new Date("SEPTEMBER 1 1980"));
        map.put("щ", new Date("JUNE 1 1980"));


        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //Напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            int month = iterator.next().getValue().getMonth() + 1;
            if ( month >= 6 && month <= 8)
                iterator.remove();
        }
    }

    public static void main(String[] args)
    {
        HashMap<String, Date> map = createMap();
        print(map);
        removeAllSummerPeople(map);
        System.out.println();
        print(map);

    }

    public static void print(HashMap<String, Date> map)
    {
        for (Map.Entry<String, Date> m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue().getMonth());
    }

}
