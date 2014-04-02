package head.first.chapter5;

import java.util.ArrayList;

/**
 * Created by Andrew on 23.03.2014.
 */
public class DotCom
{
    private ArrayList<String> locationCels;
    private String name;
//    private int[] locationCels;
//    private int numOfHits = 0;

    public void setName(String n)
    {
        name = n;
    }

    public String chekYourSelf(String userInput)
    {
        String result = "Мимо";

        int index = locationCels.indexOf(userInput);

        if (index >= 0)
        {
            locationCels.remove(index);

            if (locationCels.isEmpty())
            {
                result = "Потопил";
            } else
            {
                result = "Попал";
            }
        }

        return result;
    }

    public void setLocationCels(ArrayList<String> cellLocation)
    {
        this.locationCels = cellLocation;
    }
}
