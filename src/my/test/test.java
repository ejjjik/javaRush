package my.test;

import java.util.ArrayList;

/**
 * Created by Andrew on 27.03.2014.
 */
public class test
{
    private static final int SIZE = 20;

    public static void main(String[] args)
    {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < SIZE; i++)
        {
            list.add((int) (Math.random() * 100));
//            System.out.println((int)(Math.random()*100));
        }

        print(list);
        sort(list);
        print(list);
    }

    public static void print(ArrayList<Integer> list)
    {
        for (Integer l : list)
            System.out.print(l + " ");

        System.out.println();
    }

    public static void sort(ArrayList<Integer> list)
    {
        int max, min, end;
        int indexMax;
        int indexMin;

        for (int i = 0; i < list.size() / 2; i++)
        {
            indexMax = i;
            end = list.size() - 1;
            indexMin = end;



            for (int j = i; j < list.size(); j++)
            {
                max = list.get(indexMax);
                if (max < list.get(j)){ max = list.get(j); indexMax = j; revers(list, indexMax, max, i);}
                min = list.get(indexMin);
                if (min > list.get(j)){ min = list.get(j); indexMin = j; revers(list, indexMin, min, end);}
            }

        }
    }

    public static void revers(ArrayList<Integer>list, int index, int value, int i)
    {
        int tmp;
        tmp = list.get(i);
        list.set(i, value);
        list.set(index, tmp);

    }

}

