package my.test;

import java.util.ArrayList;

/**
 * Created by Andrew on 27.03.2014.
 */
public class test2
{
    private static final int SIZE = 10;

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < SIZE; i++)
        {
            list.add((int) (Math.random() * 100));
//            System.out.println((int)(Math.random()*100));
        }
        print(list);
        for (int i = 0; i < list.size() / 2; i++)
        {
            for (int j = i; j < list.size(); j++)
            {
            }
            System.out.print(list.get(i) + " " + list.get(list.size()-1-i));
            System.out.println();

        }


    }
    public static void print(ArrayList<Integer> list)
    {
        for (Integer l : list)
            System.out.print(l + " ");

        System.out.println();
    }
}
