package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution
{
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static
    {
        labels.put(1.0,"q");
        labels.put(2.0,"w");
        labels.put(3d,"e");
        labels.put(4d,"r");
        labels.put(5d,"t");
    }

    public static void main(String[] args)
    {
        System.out.println(labels);
    }
}
