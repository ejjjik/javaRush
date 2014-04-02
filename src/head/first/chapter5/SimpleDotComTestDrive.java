package head.first.chapter5;

/**
 * Created by Andrew on 23.03.2014.
 */
public class SimpleDotComTestDrive
{
    public static void main(String[] args)
    {
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2,3,4};
        dot.setLocationCels(locations);

        String userGuess = "2";

        String result = dot.chekYourSelf(userGuess);

        String testResults = "Неудача";

        if (result.equals("Попал"))
        {
            testResults = "Пройден";
        }

        System.out.print(testResults);
    }
}
