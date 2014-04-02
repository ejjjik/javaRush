package head.first.chapter5;

/**
 * Created by Andrew on 23.03.2014.
 */
public class SimpleDotCom
{
    private int[] locationCels;
    private int numOfHits = 0;

    public String chekYourSelf(String userGuess)
    {
        int guess = Integer.parseInt(userGuess);

        String result = "Мимо";

        for (int cell : locationCels)
        {
            if ( guess == cell)
            {
                result = "Попал";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCels.length)
        {
            result = "Потопил";
        }

        System.out.println(result);

        return result;
    }

    public void setLocationCels(int[] cellLocation)
    {
        this.locationCels = cellLocation;
    }
}
