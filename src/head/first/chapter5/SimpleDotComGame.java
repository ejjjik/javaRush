package head.first.chapter5;

/**
 * Created by Andrew on 23.03.2014.
 */
public class SimpleDotComGame
{
    public static void main(String[] args)
    {
        int numOfGuess = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        theDotCom.setLocationCels(locations);
        boolean isAlive = true;

        while (isAlive == true)
        {
            String guess = helper.getUserInput("Введите число");
            String result = theDotCom.chekYourSelf(guess);
            numOfGuess++;
            if (result.equals("Потопил"))
            {
                isAlive = false;
                System.out.println("Вам потребовалось" + numOfGuess + "попыток(и)");
            }
        }
    }
}
